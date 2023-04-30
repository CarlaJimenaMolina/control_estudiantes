package com.app.crud.estudiantes;

import com.app.crud.estudiantes.entity.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.app.crud.estudiantes.repository.EstudianteRepository;

@SpringBootApplication
public class EstudiantesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EstudiantesApplication.class, args);
	}

	@Autowired
	private EstudianteRepository estudianteRepository;
	@Override
	public void run(String... args) throws Exception {
		/*Estudiante estudiante1 = new Estudiante("Ana","aaa","anaa.20@gmail.com");
		estudianteRepository.save(estudiante1);

		Estudiante estudiante2 = new Estudiante("Juana","aaa","juaanaa.20@gmail.com");
		estudianteRepository.save(estudiante2);*/
	}
}
