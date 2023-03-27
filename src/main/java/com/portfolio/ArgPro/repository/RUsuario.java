/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.ArgPro.repository;

import com.portfolio.ArgPro.entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author aquil
 */

@Repository
public interface RUsuario extends JpaRepository<Usuario, Long>{
    Optional<Usuario> findOneByEmail(String email);
}
 