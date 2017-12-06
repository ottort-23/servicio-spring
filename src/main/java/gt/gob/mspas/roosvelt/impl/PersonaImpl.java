/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.gob.mspas.roosvelt.impl;

import gt.gob.mspas.roosvelt.config.CustomErrorType;
import gt.gob.mspas.roosvelt.config.ResponseBuilder;
import gt.gob.mspas.roosvelt.entity.SADPaciente;
import gt.gob.mspas.roosvelt.entity.ERPPersona;
import gt.gob.mspas.roosvelt.entity.TtPersona;
import gt.gob.mspas.roosvelt.service.PersonaService;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author Ottoniel RT
 */
public class PersonaImpl implements PersonaService {

    @Autowired
    SessionFactory sessionFactory;

    Session session = null;
    Transaction tx = null;

    @Override
    public ResponseEntity<?> savePersona(ERPPersona persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<ERPPersona> getPersonaBydId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResponseEntity<Map<String, Object>> getPersonaList(String str) {
        List<SADPaciente> personaList = new ArrayList<>();
        List<TtPersona> personaSigsaList = new ArrayList<>();
        String message;
        try {
            session = sessionFactory.openSession();
            Query query = session.createQuery("from SADPaciente md where cast(md.expedienteConcatenado as string)"
                    + " + ' ' + md.pacPersona.personaConcatenado LIKE lower(:str)");
            query.setParameter("str", "%" + str + "%");
            query.setFirstResult(0);
            query.setMaxResults(50);
            personaList = query.list();

            if (personaList.isEmpty()) {
                return new ResponseEntity(new CustomErrorType("No existe expediente con correlativo :" + str), HttpStatus.BAD_REQUEST);
            }

        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            session.close();
            System.out.println(e.toString());
            return new ResponseEntity(new CustomErrorType("Ocurrio un error al buscar expediente :" + e), HttpStatus.BAD_REQUEST);
        }
        session.close();
        personaSigsaList = (prepararPersona(personaList));
        message = "La consulta se realizo con exito!";

        return ResponseBuilder.response(personaSigsaList, message, true);
    }

    @Override
    public ResponseEntity<?> deletePersona(ERPPersona personaRoosevelt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TtPersona> prepararPersona(List<SADPaciente> personaRoosevelt) {
        List<TtPersona> personaSigsaList = new ArrayList<>();

        for (SADPaciente c : personaRoosevelt) {
            TtPersona persona = new TtPersona();
            persona.setPrimerNombre(c.getPacPersona().getPerPrimerNombre());
            persona.setPrimerApellido(c.getPacPersona().getPerPrimerApellido());

            persona.setSegundoNombre(c.getPacPersona().getPerSegundoNombre());
            persona.setSegundoApellido(c.getPacPersona().getPerSegundoApellido());
            persona.setApellidoCasada(c.getPacPersona().getPerApellidoCasada());

            if (c.getPacPersona().getPerEstadoCivil().getECRegistro() == 2) {
                persona.setIdEstadoCivil(1);
            }
            if (c.getPacPersona().getPerEstadoCivil().getECRegistro() == 3) {
                persona.setIdEstadoCivil(2);
            }

            Integer grupoEtnico, municipio = null;

            if (c.getPacPersona().getPerGrupoEtnico() != null) {
                grupoEtnico = c.getPacPersona().getPerGrupoEtnico().getGetRegistro();
                grupoEtnico = grupoEtnico - 1;
                persona.setIdGrupoEtnico(grupoEtnico);
            }

            persona.setExpediente(c.getExpedienteConcatenado());
            persona.setFechaNacimiento(c.getPacPersona().getPerFechaNacimiento());

            if (c.getPacPersona().getPerGenero().getSxCodigo() == 2) {
                persona.setIdSexo(1);
            }
            if (c.getPacPersona().getPerGenero().getSxCodigo() == 1) {
                persona.setIdSexo(2);
            }

            if (c.getPacPersona().getPerLugar().getMunRegistro() == 12) {
                persona.setIdMunicipio(1);
            } else if (c.getPacPersona().getPerLugar().getMunRegistro() == 13) {
                persona.setIdMunicipio(5);
            } else if (c.getPacPersona().getPerLugar().getMunRegistro() == 35) {
                persona.setIdMunicipio(2);
            } else if (c.getPacPersona().getPerLugar().getMunRegistro() == 36) {
                persona.setIdMunicipio(3);
            } else if (c.getPacPersona().getPerLugar().getMunRegistro() == 37) {
                persona.setIdMunicipio(4);
            } else {
                municipio = c.getPacPersona().getPerLugar().getMunRegistro();
                municipio = municipio - 32;
                persona.setIdMunicipio(municipio);
            }

            persona.setIdRedServicio(230);
            persona.setPersonaConcatenada(c.getPacPersona().getPersonaConcatenado());

            personaSigsaList.add(persona);

        }

        return personaSigsaList;
    }

}
