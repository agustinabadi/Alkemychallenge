
package com.aAbadi.Service;

import java.util.Optional;

import com.aAbadi.Model.Obra;


public interface IObraService {
	
	Optional<Obra> findByid(Long id);
	
	Obra save(Obra obra);
	
	Iterable<Obra> findAll();
	
	void delete(Long id);

}

