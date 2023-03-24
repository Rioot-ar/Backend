/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.ArgPro.service;

import com.portfolio.ArgPro.entity.Proyecto;
import java.util.List;

/**
 *
 * @author aquil
 */
public interface ISProyecto {
    public void saveProyecto(Proyecto pro);
    public Proyecto findProyecto(long id);
    public void deleteProyecto(long id);
    public List<Proyecto> findAllProyecto();    
}
