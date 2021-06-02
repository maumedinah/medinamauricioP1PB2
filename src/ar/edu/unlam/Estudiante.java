package ar.edu.unlam;

import java.util.ArrayList;

public class Estudiante {
	
	private Integer dni;
	private String apellido;
	private String nombre;
	private ArrayList<Libro> prestamos;
	private Integer limitePrestamos;

	public Estudiante(Integer dni, String apellido, String nombre) {
		this.setDni(dni);
		this.setApellido(apellido);
		this.setNombre(nombre);
		this.prestamos =  new ArrayList<Libro>();
		this.limitePrestamos = 2;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void tomaPrestado(Libro libro) {
		this.prestamos.add(libro);
	}

	public Integer librosPrestados() {
		return prestamos.size();
	}
	
	public ArrayList<Libro> getPrestamos() {
		return this.prestamos;
	}

	public void devuelveLibro(Libro unLibro) {
		this.prestamos.remove(unLibro);
	}
}
