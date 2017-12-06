/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.gob.mspas.roosvelt.controller;

import gt.gob.mspas.roosvelt.entity.SADPaciente;
import gt.gob.mspas.roosvelt.entity.TtPersona;
import gt.gob.mspas.roosvelt.service.PersonaService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Ottoniel RT
 */
@Controller
@CrossOrigin
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    PersonaService personaService;

    @RequestMapping(value = "/{str}", method = RequestMethod.GET)
    public @ResponseBody
     ResponseEntity<Map<String, Object>> getPersonaList(@PathVariable("str") String str) {
        return personaService.getPersonaList(str);
    }
}
