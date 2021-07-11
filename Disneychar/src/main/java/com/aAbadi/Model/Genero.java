package com.aAbadi.Model;

import java.awt.Image;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToMany;

import org.springframework.data.annotation.Id;

@Entity
public class Genero
{
	
	@Id
	@GeneratedValue( strategy=GenerationType.IDENTITY )
    private Long id;
	private Image imagen;
	private String nombre;
	
	@ManyToMany
	private Set<Obra> obras;

	
	
	
	
}
