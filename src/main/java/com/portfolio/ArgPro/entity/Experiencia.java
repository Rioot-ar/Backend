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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.sql.Date;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author aquil
 */
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter @Setter
    private long id;
    
    @Getter @Setter
    private String nombre_empresa;
    
    @Getter @Setter
    private String cargo;
    
    @Temporal(TemporalType.DATE)
    @Getter @Setter
    private Date fecha_inicio;  
    
    @Temporal(TemporalType.DATE)
    @Getter @Setter
    private Date fecha_fin;
    
    @Column(length=512)
    @Getter @Setter
    private String descripcion;
    
    @Getter @Setter
    private String imagen;
    
}
