/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.tienda.service;

import com.tienda.tienda.Entity.Persona;
import com.tienda.tienda.Repositorio.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Mathias
 */
@Service
public class PersonaService implements IPersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public List<Persona> getAllPersona() {
        return (List <Persona>)personaRepository.findAll();
    }

    @Override
    public Persona getPersonaByid(long id) {
        return personaRepository.findById(id).orElse(null);
    }

    @Override
    public void savePersona(Persona persona) {
        personaRepository.save(persona);
    }
    
     @Override
    public List<Persona> buscarPorApellido1(String apellido1) {
        return personaRepository.findByApellido1(apellido1);
    }

    @Override
    public void delete(long id) {
        personaRepository.deleteById(id);
    }



    
}
