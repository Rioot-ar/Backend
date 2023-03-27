/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.ArgPro.security;

import com.portfolio.ArgPro.entity.Usuario;
import com.portfolio.ArgPro.repository.RUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author aquil
 */

@Service
public class UserDetailServiceImpl implements UserDetailsService{
    
    @Autowired 
    private RUsuario rusuario;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Usuario usuario=rusuario
            .findOneByEmail(email)
            .orElseThrow(()-> new UsernameNotFoundException (email));
        return new UserDetailsImpl(usuario);
    }
    
    
}
