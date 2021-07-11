package com.aAbadi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import com.aAbadi.Model.Personaje;
import com.aAbadi.Repository.IPersonajeRepository;
import com.aAbadi.Service.IPersonajeService;


@Controller
public class PersonajeController 
{
	/*
	@Autowired
	private final IPersonajeRepository service;

	PersonajeController(IPersonajeRepository service) 
	{
	    this.service = service;
	}
	
	
	
	  @GetMapping("/c")
	  Iterable<Personaje> all() 
	  {
	    return service.findAll();
	  }
	  */
	  @GetMapping("/hola")
	  public String hola() 
	  {
		  
	    return "Hola";
	  }
	  @GetMapping("/")
	    public String main() {
	        

	        return "welcome"; //view
	    }
	

}
