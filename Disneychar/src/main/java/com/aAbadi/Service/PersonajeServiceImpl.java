package com.aAbadi.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aAbadi.Model.Personaje;
import com.aAbadi.Repository.IPersonajeRepository;

@Service
public class PersonajeServiceImpl implements IPersonajeService
{

	@Autowired
	private IPersonajeRepository personajeRepository;
	
	
	 public PersonajeServiceImpl(IPersonajeRepository personajeRepository) 
	 {
		 
	        this.personajeRepository = personajeRepository;
	 }

	@Override
	public Optional<Personaje> findByid(Long id) 
	{
		return personajeRepository.findById(id);
	}

	@Override
	public Personaje save(Personaje personaje)
	{
		return personajeRepository.save(personaje);
	}

	@Override
	public Iterable<Personaje> findAll() 
	{
		return personajeRepository.findAll();
	}
	@Override
	public void delete(Long id)
	{	
		personajeRepository.deleteById(id);
	}


}
