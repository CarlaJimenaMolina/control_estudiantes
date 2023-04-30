package com.app.crud.estudiantes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.app.crud.estudiantes.service.EstudianteService;

@Controller
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    @GetMapping({ "/estudiantes","/"})
    public String listarEstudiantes(Model modelo){
        modelo.addAttribute("estudiantes", estudianteService.listarTodosEstudiantes());
        return "estudiantes";
    }
}
