/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.tienda.Controller;

import com.tienda.tienda.Entity.Pais;
import com.tienda.tienda.Entity.Persona;
import com.tienda.tienda.service.IPaisService;
import com.tienda.tienda.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 *
 * @author Mathias
 */
@Controller
public class PersonaController {

    @Autowired
    private IPersonaService personaService;

    @Autowired
    private IPaisService paisService;

    @GetMapping("/personas")
    public String index(Model model) {
        List<Persona> listaPersona = personaService.getAllPersona();
        model.addAttribute("titulo", "Tabla Personas");
        model.addAttribute("personas", listaPersona);
        return "personas";
    }

    @GetMapping("/personaN")
    public String crearPersona(Model model) {
        List<Pais> listaPaises = paisService.listCountry();
        model.addAttribute("personas", new Persona());
        model.addAttribute("paises", listaPaises);
        return "crear";
    }

    @GetMapping("/delete/{id}")
    public String eliminarPersona(@PathVariable("id") Long Persona_id) {
        personaService.delete(Persona_id);
        return "redirect:/personas";
    }

    @PostMapping("/save")
    public String guardarPersona(@ModelAttribute Persona persona) {
        personaService.savePersona(persona);
        return "redirect:/personas";
    }
    
    @GetMapping("/buscar")
    public String buscarPorApellido(@RequestParam String apellido1, Model model) {
        List<Persona> personas = personaService.buscarPorApellido1(apellido1);
        model.addAttribute("personas", personas);
        return "buscar";
    }

    @GetMapping("/editPersona/{id}")
    public String editarPersona(@PathVariable("id")Long Persona_id,Model model){
        Persona personas = personaService.getPersonaByid(Persona_id);
        List<Pais> listaPaises = paisService.listCountry();
        model.addAttribute("paises", personas);
        model.addAttribute("paises", listaPaises);
        return "crear";
    }
    
}
