/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.gob.mspas.roosvelt.service;


import gt.gob.mspas.roosvelt.entity.ERPPersona;
import gt.gob.mspas.roosvelt.entity.SADPaciente;
import gt.gob.mspas.roosvelt.entity.TtPersona;
import java.util.List;
import java.util.Map;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author Ottoniel RT
 */
public interface PersonaService {

    public ResponseEntity<?> savePersona(ERPPersona persona);

    public ResponseEntity<ERPPersona> getPersonaBydId(Integer id);

    public ResponseEntity<Map<String, Object>> getPersonaList(String str);

    public ResponseEntity<?> deletePersona(ERPPersona persona);
    
    public List<TtPersona> prepararPersona (List<SADPaciente> listPaciente);

}
