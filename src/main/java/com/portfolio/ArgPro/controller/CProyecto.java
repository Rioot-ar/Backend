/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.ArgPro.controller;

import com.portfolio.ArgPro.entity.Proyecto;
import com.portfolio.ArgPro.service.ISProyecto;
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
@RequestMapping("api/proyecto")
@CrossOrigin(origins = "http://localhost:4200")
public class CProyecto {
    @Autowired
    private ISProyecto iProyecto;
    
    @GetMapping("{id}")
    public Proyecto obProyecto(@PathVariable long id){
        return iProyecto.findProyecto(id);
    }
    
    @GetMapping("traer")
    public List<Proyecto> obProyectos(){
        return iProyecto.findAllProyecto();
    }
    
    @PostMapping("crear")
    public Proyecto crProyecto(@RequestBody Proyecto pro){
        iProyecto.saveProyecto(pro);
        return pro;
    }
    
    @DeleteMapping("borrar/{id}")
    public Proyecto brProyecto(@PathVariable long id){
        Proyecto pro = iProyecto.findProyecto(id);
        iProyecto.deleteProyecto(id);
        return pro;
    }
    
    @PutMapping("editar")
    public Proyecto edProyecto(@RequestBody Proyecto pro){
        
        iProyecto.saveProyecto(pro);
        return iProyecto.findProyecto(pro.getId());
    }
}
