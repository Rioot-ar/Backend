/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.ArgPro.controller;

import com.portfolio.ArgPro.entity.Habilidad;
import com.portfolio.ArgPro.service.ISHabilidad;
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
@RequestMapping("habilidad")
@CrossOrigin(origins = "http://localhost:4200")
public class CHabilidad {
    @Autowired
    private ISHabilidad iHabilidad;
    
    @GetMapping("{id}")
    public Habilidad obHabilidad(@PathVariable long id){
        return iHabilidad.findHabilidad(id);
    }
    
    @GetMapping("traer")
    public List<Habilidad> obHabilidades(){
        return iHabilidad.findAllHabilidad();
    }
    
    @PostMapping("crear")
    public String crHabilidad(@RequestBody Habilidad hab){
        iHabilidad.saveHabilidad(hab);
        return "Habilidad Creada";
    }
    
    @DeleteMapping("borrar/{id}")
    public String brHabilidad(@PathVariable long id){
        iHabilidad.deleteHabilidad(id);
        return "Habilidad Eliminada";
    }
    
    @PutMapping("editar")
    public Habilidad edHabilidad(@RequestBody Habilidad hab){
        
        iHabilidad.saveHabilidad(hab);
        return iHabilidad.findHabilidad(hab.getId());
    }
}
