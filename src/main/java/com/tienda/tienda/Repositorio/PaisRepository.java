/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.tienda.Repositorio;

import com.tienda.tienda.Entity.Pais;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Mathias
 */
@Repository
public interface PaisRepository extends CrudRepository<Pais,Long>{
    
}
