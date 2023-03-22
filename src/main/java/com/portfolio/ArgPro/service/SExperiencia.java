/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.ArgPro.service;

import com.portfolio.ArgPro.entity.Experiencia;
import com.portfolio.ArgPro.repository.RExperiencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author aquil
 */

@Service
public class SExperiencia implements ISExperiencia {
    
    @Autowired
    private RExperiencia rexperiencia;

    @Override
    public void saveExperiencia(Experiencia exp) {
        rexperiencia.save(exp);
    }

    @Override
    public Experiencia findExperiencia(long id) {
        return rexperiencia.findById(id).orElse(null);
    }

    @Override
    public void deleteExperiencia(long id) {
        rexperiencia.deleteById(id);
    }
    
}
