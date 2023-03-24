/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.ArgPro.service;

import com.portfolio.ArgPro.entity.Educacion;
import java.util.List;

/**
 *
 * @author aquil
 */
public interface ISEducacion {
    public void saveEducacion(Educacion edu);
    public Educacion findEducacion(long id);
    public void deleteEducacion(long id);
    public List<Educacion> findAllEducacion();
}
