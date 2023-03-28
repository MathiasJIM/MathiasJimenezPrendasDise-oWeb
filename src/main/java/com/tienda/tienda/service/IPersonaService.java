/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.tienda.service;

import com.tienda.tienda.Entity.Persona;
import java.util.List;

/**
 *
 * @author Mathias
 */
public interface IPersonaService {
    List<Persona> buscarPorApellido1(String apellido1);
    public List<Persona> getAllPersona();
    public Persona getPersonaByid (long id);
    public void savePersona(Persona persona);
    public void delete (long id);
}
