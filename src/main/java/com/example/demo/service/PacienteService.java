package com.example.demo.service;

import com.example.demo.repository.modelo.Paciente;

public interface PacienteService {
	public void agregar(Paciente doctor);
	public Paciente buscar(String cedula);
	public void actualizar(Paciente doctor);
	public void borrar(String cedula);
}
