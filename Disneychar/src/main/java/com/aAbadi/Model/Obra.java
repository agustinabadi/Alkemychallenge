package com.aAbadi.Model;

import java.awt.Image;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToMany;

import org.springframework.data.annotation.Id;

@Entity
public class Obra
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private Image imagen;
	private String nombre;
	private Date fechaDeEstreno;
	private double calificacion;
	
	@ManyToMany
	private Set<Personaje> personajes;
	@ManyToMany
	private Set<Genero> generos;
	
	
	
	
	
	
	
	
	
	
	public Obra(Long id, Image imagen, String nombre, Date fechaDeEstreno, double calificacion,
			Set<Personaje> personajes, Set<Genero> generos) {
		super();
		this.id = id;
		this.imagen = imagen;
		this.nombre = nombre;
		this.fechaDeEstreno = fechaDeEstreno;
		this.calificacion = calificacion;
		this.personajes = personajes;
		this.generos = generos;
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
	public Date getFechaDeEstreno() {
		return fechaDeEstreno;
	}
	public void setFechaDeEstreno(Date fechaDeEstreno) {
		this.fechaDeEstreno = fechaDeEstreno;
	}
	public double getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
	public Set<Personaje> getPersonajes() {
		return personajes;
	}
	public void setPersonajes(Set<Personaje> personajes) {
		this.personajes = personajes;
	}
	public Set<Genero> getGeneros() {
		return generos;
	}
	public void setGeneros(Set<Genero> generos) {
		this.generos = generos;
	}

	
	

}
