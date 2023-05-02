package com.app.crud.estudiantes.service;

import com.app.crud.estudiantes.entity.Estudiante;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EstudianteService {
    public List<Estudiante> listarTodosEstudiantes();

    public Estudiante guardarEstudiante(Estudiante estudiante);

    public Estudiante obtenerEstudiantePorId(Long id);

    public Estudiante actualizarEstudiante(Estudiante estudiante);

    public void eliminarEstudiante(Long id);
}
