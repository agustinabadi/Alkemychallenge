package com.aAbadi.Service;

import java.util.Optional;

import com.aAbadi.Model.Personaje;


public interface IPersonajeService {
	
	Optional<Personaje> findByid(Long id);
	
	Personaje save(Personaje personaje);
	
	Iterable<Personaje> findAll();
	
	void delete(Long id);

}

