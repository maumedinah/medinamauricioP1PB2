package ar.edu.unlam;

import java.util.ArrayList;

public class Biblioteca {
	
	private ArrayList<Libro> catalogo;
	
	public Biblioteca () {
		this.catalogo = new ArrayList<Libro>();
	}

	public void agregarLibro(Libro unLibro) {
		this.catalogo.add(unLibro);
	}

	public void estudianteExtraeLibro(Estudiante unEstudiante, Integer codigo) {
		for(int i=0 ; i<catalogo.size() ; i++) {
			Libro unLibro = catalogo.get(i);
			if(unLibro.getCodigo() == codigo && unEstudiante.librosPrestados() < 2  && (!unLibro.estaPrestado())) {
				unLibro.prestadoA(unEstudiante);
				unEstudiante.tomaPrestado(unLibro);
			}
		}
	}

	public void estudianteDevuelveLibro(Estudiante unEstudiante, Integer codigo) {
		for(int i=0 ; i<catalogo.size() ; i++) {
			Libro unLibro = catalogo.get(i);
			if(unLibro.getCodigo() == codigo) {
				this.catalogo.get(i).devuelve();
				unEstudiante.devuelveLibro(unLibro);
			}
		}
	}
}
