package com.example.demo.repository;



import org.springframework.stereotype.Repository;



import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class CitaMedicaRepositoryImpl implements CitaMedicaRepository{

	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public void crear(String numeroTurno) {
			
			this.entityManager.persist(numeroTurno);
			
		
		
	}

}
