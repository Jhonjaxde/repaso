package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Doctor;
//import com.example.demo.service.CitaMedicaService;
import com.example.demo.service.DoctorService;
//import com.example.demo.service.PacienteService;

@SpringBootApplication
public class RepasoApplication implements CommandLineRunner {
	
	@Autowired
	private DoctorService doctorService;
	
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(RepasoApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		Doctor doc1 = new Doctor();
		doc1.setNombre("jhon");
		doc1.setApellido("arteaga");
		doc1.setCedula("1234567890");
		doc1.setFechaNacimiento(LocalDateTime.of(2000, 5, 3, 12, 0));
		doc1.setNumeroConsultorio("54");
		doc1.setTitulo("doctor");
		doc1.setSalario(new BigDecimal(1000));
		
		
		Doctor doc2 = new Doctor();
		doc2.setNombre("juan");
		doc2.setApellido("ortiga");
		doc2.setCedula("0987654321");
		doc2.setFechaNacimiento(LocalDateTime.of(2222, 12, 4, 11, 0));
		doc2.setNumeroConsultorio("69");
		doc2.setTitulo("casi doctor");
		doc2.setSalario(new BigDecimal(20));
		//this.doctorService.agregar(doc1);
		//this.doctorService.agregar(doc2);
		
		//System.out.println(this.doctorService.buscar(1)); 
		//this.doctorService.borrar();
		System.out.println(this.doctorService.encontrarPorNombre(doc1.getNombre()));
	}

}
