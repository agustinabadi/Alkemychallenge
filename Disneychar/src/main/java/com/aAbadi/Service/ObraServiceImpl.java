
package com.aAbadi.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aAbadi.Model.Obra;
import com.aAbadi.Repository.IObraRepository;

@Service
public class ObraServiceImpl implements IObraService
{

	@Autowired
	private IObraRepository obraRepository;
	
	
	 public ObraServiceImpl(IObraRepository obraRepository) 
	 {
		 
	        this.obraRepository = obraRepository;
	 }

	@Override
	public Optional<Obra> findByid(Long id) 
	{
		return obraRepository.findById(id);
	}

	@Override
	public Obra save(Obra obra)
	{
		return obraRepository.save(obra);
	}

	@Override
	public Iterable<Obra> findAll() 
	{
		return obraRepository.findAll();
	}
	@Override
	public void delete(Long id)
	{	
		obraRepository.deleteById(id);
	}




}