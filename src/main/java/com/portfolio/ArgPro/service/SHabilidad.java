/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.ArgPro.service;

import com.portfolio.ArgPro.entity.Habilidad;
import com.portfolio.ArgPro.repository.RHabilidad;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author aquil
 */

@Service
public class SHabilidad implements ISHabilidad{
    
    @Autowired
    private RHabilidad rhabilidad;
    
    @Override
    public void saveHabilidad(Habilidad hab) {
        rhabilidad.save(hab);
    }

    @Override
    public Habilidad findHabilidad(long id) {
        return rhabilidad.findById(id).orElse(null);
    }

    @Override
    public void deleteHabilidad(long id) {
        rhabilidad.deleteById(id);
    }

    @Override
    public List<Habilidad> findAllHabilidad() {
        return rhabilidad.findAll();
    }
    
}
