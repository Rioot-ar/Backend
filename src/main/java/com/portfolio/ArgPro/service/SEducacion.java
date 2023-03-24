/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.ArgPro.service;

import com.portfolio.ArgPro.entity.Educacion;
import com.portfolio.ArgPro.repository.REducacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author aquil
 */

@Service
public class SEducacion implements ISEducacion{
    
    @Autowired
    private REducacion reducacion;

    @Override
    public void saveEducacion(Educacion edu) {
        reducacion.save(edu);
    }

    @Override
    public Educacion findEducacion(long id) {
        Educacion educ=reducacion.findById(id).orElse(null);
        return educ;
    }

    @Override
    public void deleteEducacion(long id) {
        reducacion.deleteById(id);
    }

    @Override
    public List<Educacion> findAllEducacion() {
        return reducacion.findAll();
    }
    
}
