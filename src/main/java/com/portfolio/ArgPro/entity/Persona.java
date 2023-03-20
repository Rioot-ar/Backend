/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.ArgPro.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author aquil
 */
@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter @Setter
    private long id;
    
    @Getter @Setter
    private String nombre;
    
    @Getter @Setter
    private String apellido;
    
    @Getter @Setter
    private String cargo;
    
    @Getter @Setter
    private String telefono;  
    
    @Getter @Setter
    private String correo;
    
    @Column(name="sobre_mi",length=512)
    @Getter @Setter
    private String sobre_mi;
    
    @Getter @Setter
    private String url_foto;
    
    @Getter @Setter
    private String url_banner;
}
