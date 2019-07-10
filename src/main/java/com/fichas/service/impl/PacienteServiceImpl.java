package com.fichas.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fichas.model.Paciente;
import com.fichas.repo.IPacienteRepo;
import com.fichas.services.IPacienteService;

@Service
public class PacienteServiceImpl implements IPacienteService{

	@Autowired  //definido para llamar a la instancia propia de jpa ya no se necita definir repository en ipaciente repo
	private IPacienteRepo repo;
	
	@Override
	public void registrar(Paciente pac) {
		repo.save(pac);
		
	}

	@Override
	public void modificar(Paciente pac) {
		repo.save(pac);
		
	}

	@Override
	public List<Paciente> listar() {
		return repo.findAll();
	}

	@Override
	public Paciente leerPorId(Integer id) {
		return repo.findOne(id);
	}

	@Override
	public void eliminar(Integer Id) {
		repo.delete(Id);
		
	}
	
	

}
