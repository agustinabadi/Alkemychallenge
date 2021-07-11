

package com.aAbadi.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aAbadi.Model.Genero;
import com.aAbadi.Repository.IGeneroRepository;

@Service
public class GeneroServiceImpl implements IGeneroService
{

	@Autowired
	private IGeneroRepository generoRepository;
	
	
	 public GeneroServiceImpl(IGeneroRepository generoRepository) 
	 {
		 
	        this.generoRepository = generoRepository;
	 }

	@Override
	public Optional<Genero> findByid(Long id) 
	{
		return generoRepository.findById(id);
	}

	@Override
	public Genero save(Genero genero)
	{
		return generoRepository.save(genero);
	}

	@Override
	public Iterable<Genero> findAll() 
	{
		return generoRepository.findAll();
	}
	@Override
	public void delete(Long id)
	{	
		generoRepository.deleteById(id);
	}




}