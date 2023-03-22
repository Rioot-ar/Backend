/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.ArgPro.service;

import com.portfolio.ArgPro.entity.Red;
import com.portfolio.ArgPro.repository.RRed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author aquil
 */

@Service
public class SRed implements ISRed{
    
    @Autowired
    private RRed rred;

    @Override
    public void saveRed(Red red) {
        rred.save(red);
    }

    @Override
    public Red findRed(long id) {
        return rred.findById(id).orElse(null);
    }

    @Override
    public void deleteRed(long id) {
        rred.deleteById(id);
    }
    
}
