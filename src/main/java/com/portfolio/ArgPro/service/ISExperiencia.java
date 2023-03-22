/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.ArgPro.service;

import com.portfolio.ArgPro.entity.Experiencia;

/**
 *
 * @author aquil
 */
public interface ISExperiencia {
    public void saveExperiencia(Experiencia exp);
    public Experiencia findExperiencia(long id);
    public void deleteExperiencia(long id);
}
