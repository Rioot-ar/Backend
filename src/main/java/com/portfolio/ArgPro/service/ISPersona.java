/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.ArgPro.service;

import com.portfolio.ArgPro.entity.Persona;

/**
 *
 * @author aquil
 */
public interface ISPersona {
    public void savePersona(Persona per);
    public Persona findPersona(long id);
    public void deletePersona(long id);
}
