package com.aAbadi.Model;

import java.awt.Image;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToMany;

import org.springframework.data.annotation.Id;

@Entity
public class Personaje 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private Image imagen;
	private String nombre;
	private double edad; //en años
	private double peso; //en kilos
	private String historia;
	
	@ManyToMany
	private Set<Obra> obras;

	
	
	
	
	
	public Personaje(Long id, Image imagen, String nombre, double edad, double peso, String historia, Set<Obra> obras) {
		super();
		this.id = id;
		this.imagen = imagen;
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.historia = historia;
		this.obras = obras;
	}

	public Personaje() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Image getImagen() {
		return imagen;
	}

	public void setImagen(Image imagen) {
		this.imagen = imagen;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getEdad() {
		return edad;
	}

	public void setEdad(double edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getHistoria() {
		return historia;
	}

	public void setHistoria(String historia) {
		this.historia = historia;
	}

	public Set<Obra> getObras() {
		return obras;
	}

	public void setObras(Set<Obra> obras) {
		this.obras = obras;
	}

}
