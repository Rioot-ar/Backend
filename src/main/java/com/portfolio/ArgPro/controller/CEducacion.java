/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.ArgPro.controller;

import com.portfolio.ArgPro.entity.Educacion;
import com.portfolio.ArgPro.service.ISEducacion;
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
@RequestMapping("api/educacion")
@CrossOrigin
public class CEducacion {
    @Autowired
    private ISEducacion iEducacion;
    
    @GetMapping("{id}")
    public Educacion obEducacion(@PathVariable long id){
        return iEducacion.findEducacion(id);
    }
    @GetMapping("traer")
    public List<Educacion> obEducaciones(){
        return iEducacion.findAllEducacion();
    }
    
    @PostMapping("crear")
    public Educacion crEducacion(@RequestBody Educacion edu){
        iEducacion.saveEducacion(edu);
        return edu;
    }
    
    @DeleteMapping("borrar/{id}")
    public Educacion brEducacion(@PathVariable long id){
        Educacion edu=iEducacion.findEducacion(id);
        iEducacion.deleteEducacion(id);
        return edu;
    }
    
    @PutMapping("editar")
    public Educacion edEducacion(@RequestBody Educacion edu){
        
        iEducacion.saveEducacion(edu);
        return iEducacion.findEducacion(edu.getId());
    }
}