/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.ArgPro.controller;

import com.portfolio.ArgPro.entity.Persona;
import com.portfolio.ArgPro.service.ISPersona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author aquil
 */
@RestController
@RequestMapping("api/persona")
@CrossOrigin
public class CPersona {
    @Autowired
    private ISPersona ipersona;
    
    @GetMapping("traer")
    public List<Persona> obPersonas(){
        return ipersona.findAllPersona();
    }
    
    @PostMapping("crear")
    public String crPersona(@RequestBody Persona per){
        ipersona.savePersona(per);
        return "Persona Creada";
    }
    
    @DeleteMapping("borrar/{id}")
    public String brPersona(@PathVariable long id){
        ipersona.deletePersona(id);
        return "Persona Eliminada";
    }
    
    @PutMapping("editar")
    public Persona edPersona(@RequestBody Persona per){
        
        ipersona.savePersona(per);
        return ipersona.findPersona(per.getId());
    }
}
