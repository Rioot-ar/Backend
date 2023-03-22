/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.ArgPro.service;

import com.portfolio.ArgPro.entity.Habilidad;

/**
 *
 * @author aquil
 */
public interface ISHabilidad {
    public void saveHabilidad(Habilidad hab);
    public Habilidad findHabilidad(long id);
    public void deleteHabilidad(long id);
}
