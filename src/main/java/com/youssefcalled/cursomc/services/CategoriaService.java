package com.youssefcalled.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youssefcalled.cursomc.domain.Categoria;
import com.youssefcalled.cursomc.repositories.CategoriaRepository;

import com.youssefcalled.cursomc.services.exceptions.*;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	//Buscar Categoria por Código
	public Categoria find(Integer id) throws ObjectNotFoundException{
		Optional<Categoria> obj = repo.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
		
		
	}
	
}
