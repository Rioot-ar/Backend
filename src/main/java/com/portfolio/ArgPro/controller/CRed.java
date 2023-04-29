/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.ArgPro.controller;

import com.portfolio.ArgPro.entity.Red;
import com.portfolio.ArgPro.service.ISRed;
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
@RequestMapping("api/red")
@CrossOrigin(origins = "https://portfolioweb-frontend-12a75.web.app/")
public class CRed {
    @Autowired
    private ISRed iRed;
    
    @GetMapping("{id}")
    public Red obRed(@PathVariable long id){
        return iRed.findRed(id);
    }
    
    @GetMapping("traer")
    public List<Red> obRedes(){
        return iRed.findAllRed();
    }
    
    @PostMapping("crear")
    public Red crRed(@RequestBody Red red){
        iRed.saveRed(red);
        return red;
    }
    
    @DeleteMapping("borrar/{id}")
    public Red brRed(@PathVariable long id){
        Red red = iRed.findRed(id);
        iRed.deleteRed(id);
        return red;
    }
    
    @PutMapping("editar")
    public Red edRed(@RequestBody Red red){
        
        iRed.saveRed(red);
        return iRed.findRed(red.getId());
    }
}