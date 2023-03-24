/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.ArgPro.service;

import com.portfolio.ArgPro.entity.Red;
import java.util.List;

/**
 *
 * @author aquil
 */
public interface ISRed {
    public void saveRed(Red red);
    public Red findRed(long id);
    public void deleteRed(long id);
    public List<Red> findAllRed();
}
