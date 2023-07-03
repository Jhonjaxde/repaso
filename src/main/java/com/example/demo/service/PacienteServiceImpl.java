package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.PacienteRepository;
import com.example.demo.repository.modelo.Paciente;
@Service
public class PacienteServiceImpl implements PacienteService{
	
	@Autowired
	private PacienteRepository pacienteRepository;
	
	@Override
	public void agregar(Paciente doctor) {
		this.pacienteRepository.crear(doctor);
		
	}

	@Override
	public Paciente buscar(String cedula) {
		
		return this.pacienteRepository.leer(cedula);
	}

	@Override
	public void actualizar(Paciente doctor) {
		this.pacienteRepository.actualizar(doctor);
		
	}

	@Override
	public void borrar(String cedula) {
		this.pacienteRepository.eliminar(cedula);
		
	}

}
