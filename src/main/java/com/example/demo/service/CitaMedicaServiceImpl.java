package com.example.demo.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.CitaMedicaRepository;

@Service
public class CitaMedicaServiceImpl implements CitaMedicaService{
	
	@Autowired
	private CitaMedicaRepository citaMedicaRepository;
	@Override
	public void agregar(String numeroTurno) {
		this.citaMedicaRepository.crear(numeroTurno);
	}

}
