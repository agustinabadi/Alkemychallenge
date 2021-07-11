

package com.aAbadi.Service;

import java.util.Optional;

import com.aAbadi.Model.Genero;


public interface IGeneroService {
	
	Optional<Genero> findByid(Long id);
	
	Genero save(Genero genero);
	
	Iterable<Genero> findAll();
	
	void delete(Long id);

}
