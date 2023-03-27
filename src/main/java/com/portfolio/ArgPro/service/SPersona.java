/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.ArgPro.service;

import com.portfolio.ArgPro.entity.Persona;
import com.portfolio.ArgPro.repository.RPersona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author aquil
 */

@Service
public class SPersona implements ISPersona{
    @Autowired
    private RPersona rpersona;

    @Override
    public void savePersona(Persona per) {
        rpersona.save(per);
    }

    @Override
    public Persona findPersona(long id) {
        Persona perso=rpersona.findById(id).orElse(null);
        return perso;
    }

    @Override
    public void deletePersona(long id) {
     rpersona.deleteById(id);
    }

    @Override
    public List<Persona> findAllPersona() {
        return rpersona.findAll();
    }
    
    
    
}
