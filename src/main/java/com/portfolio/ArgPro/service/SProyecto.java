/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.ArgPro.service;

import com.portfolio.ArgPro.entity.Proyecto;
import com.portfolio.ArgPro.repository.RProyecto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author aquil
 */

@Service
public class SProyecto implements ISProyecto{
    
    @Autowired
    private RProyecto rproyecto;

    @Override
    public void saveProyecto(Proyecto pro) {
        rproyecto.save(pro);
    }

    @Override
    public Proyecto findProyecto(long id) {
        return rproyecto.findById(id).orElse(null);
    }

    @Override
    public void deleteProyecto(long id) {
        rproyecto.deleteById(id);
    }

    @Override
    public List<Proyecto> findAllProyecto() {
        return rproyecto.findAll();
    }
    
    
}
