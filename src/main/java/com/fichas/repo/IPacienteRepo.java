package com.fichas.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fichas.model.Paciente;

public interface IPacienteRepo extends JpaRepository<Paciente,Integer>{
	
}