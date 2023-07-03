package com.example.demo.repository;

import com.example.demo.repository.modelo.Paciente;

public interface PacienteRepository {
	public void crear(Paciente doctor);
	public Paciente leer(String cedula);
	public void actualizar(Paciente doctor);
	public void eliminar(String cedula);
}
