/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.ArgPro.controller;

import com.portfolio.ArgPro.entity.Experiencia;
import com.portfolio.ArgPro.service.ISExperiencia;
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
@RequestMapping("experiencia")
@CrossOrigin(origins = "http://localhost:4200")
public class CExperiencia {
    @Autowired
    private ISExperiencia iexperiencia;
    
    @GetMapping("{id}")
    public Experiencia obExperiencia(@PathVariable long id){
        return iexperiencia.findExperiencia(id);
    }
    
    @PostMapping("crear")
    public String crExperiencia(@RequestBody Experiencia exp){
        iexperiencia.saveExperiencia(exp);
        return "Experiencia Creada";
    }
    
    @DeleteMapping("borrar/{id}")
    public String brExperiencia(@PathVariable long id){
        iexperiencia.deleteExperiencia(id);
        return "Experiencia Eliminada";
    }
    
    @PutMapping("editar")
    public Experiencia edExperiencia(@RequestBody Experiencia exp){
        
        iexperiencia.saveExperiencia(exp);
        return iexperiencia.findExperiencia(exp.getId());
    }
}
