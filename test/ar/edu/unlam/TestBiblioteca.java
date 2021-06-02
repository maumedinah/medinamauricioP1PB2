package ar.edu.unlam;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBiblioteca {
	
	@Test
	public void TestCrearUnLibro() {
		
		Integer codigo = 10;
		String nombre = "Primer Libro";
		String autor = "Autor Libro";
		Libro unLibro = new Libro(codigo, nombre, autor);
		
		Integer codigoEsperado = 10;
		String nombreEsperado = "Primer Libro";
		String autorEsperado = "Autor Libro";
		
		assertNotNull(unLibro);
		assertEquals(codigoEsperado, unLibro.getCodigo());
		assertEquals(nombreEsperado, unLibro.getNombre());
		assertEquals(autorEsperado, unLibro.getAutor());
	}
	
	@Test
	public void TestCrearUnEstudianteValido() {
		
		Integer dni = 35141734;
		String apellido = "Medina";
		String nombre = "Mauricio";
		Estudiante unEstudiante = new Estudiante(dni, apellido, nombre);
		
		Integer dniEsperado = 35141734;
		String apellidoEsperado = "Medina";
		String nombreEsperado = "Mauricio";
		
		assertNotNull(unEstudiante);
		assertEquals(dniEsperado, unEstudiante.getDni());
		assertEquals(apellidoEsperado, unEstudiante.getApellido());
		assertEquals(nombreEsperado, unEstudiante.getNombre());
	}
	
	@Test
	public void TestCrearUnLibroDeHistoria() {
		Integer codigo = 123;
		String nombre = "Libro Historia 1";
		String autor = "Un autor antiguo";
		LibroHistoria unLibroHistorico = new LibroHistoria(codigo, nombre, autor);
		
		assertNotNull(unLibroHistorico);
	}
	
	@Test
	public void TestCrearUnLibroDeGeografia() {
		Integer codigo = 456;
		String nombre = "Libro Geografia 1";
		String autor = "Un autor perdido";
		LibroGeografia unLibroGeografico = new LibroGeografia(codigo, nombre, autor);
		
		assertNotNull(unLibroGeografico);
	}
	
	@Test
	public void TestCrearUnLibroDeMatematica() {
		Integer codigo = 789;
		String nombre = "Libro Matematicas 1";
		String autor = "Un autor calculado";
		LibroMatematica unLibroMatematico = new LibroMatematica(codigo, nombre, autor);
		
		assertNotNull(unLibroMatematico);
	}
	
	@Test
	public void TestBibliotecaValida() {
		Biblioteca unaBiblioteca = new Biblioteca();
		
		assertNotNull(unaBiblioteca);
	}
	
	@Test
	public void TestAgregarLibroABiblioteca() {
		Biblioteca unaBiblioteca = new Biblioteca();
		Integer codigo = 123;
		String nombre = "Libro Historia 1";
		String autor = "Un autor antiguo";
		LibroHistoria unLibroHistorico = new LibroHistoria(codigo, nombre, autor);
		unaBiblioteca.agregarLibro(unLibroHistorico);
		
		assertNotNull(unaBiblioteca);
	}
	
	@Test
	public void TestPedirUnLibroABiblioteca() {
		Biblioteca unaBiblioteca = new Biblioteca();
		Integer codigo = 123;
		String nombre = "Libro Historia 1";
		String autor = "Un autor antiguo";
		LibroHistoria unLibroHistorico = new LibroHistoria(codigo, nombre, autor);
		unaBiblioteca.agregarLibro(unLibroHistorico);
		
		Integer dni = 35141734;
		String apellido = "Medina";
		String nombreEstudiante = "Mauricio";
		Estudiante unEstudiante = new Estudiante(dni, apellido, nombreEstudiante);
		
		unaBiblioteca.estudianteExtraeLibro(unEstudiante, 123);
		assertNotNull(unaBiblioteca);
		assertEquals(nombre, unEstudiante.getPrestamos().get(0).getNombre());
	}
	
	@Test
	public void TestDevolverUnLibroABiblioteca() {
		Biblioteca unaBiblioteca = new Biblioteca();
		Integer codigo = 123;
		String nombre = "Libro Historia 1";
		String autor = "Un autor antiguo";
		LibroHistoria unLibroHistorico = new LibroHistoria(codigo, nombre, autor);
		unaBiblioteca.agregarLibro(unLibroHistorico);
		
		Integer dni = 35141734;
		String apellido = "Medina";
		String nombreEstudiante = "Mauricio";
		Estudiante unEstudiante = new Estudiante(dni, apellido, nombreEstudiante);
		
		unaBiblioteca.estudianteExtraeLibro(unEstudiante, 123);
		
		unaBiblioteca.estudianteDevuelveLibro(unEstudiante, 123);
		
		Integer librosDeEstudiante = 0;
		assertNotNull(unaBiblioteca);
		assertEquals(librosDeEstudiante, unEstudiante.getPrestamos().size(),0);
	}
	
	@Test
	public void TestPrestarMasDeDosLibrosAEstudiante() {
		Biblioteca unaBiblioteca = new Biblioteca();
		Integer codigo = 123;
		String nombre = "Libro Historia 1";
		String autor = "Un autor antiguo";
		LibroHistoria unLibroHistorico = new LibroHistoria(codigo, nombre, autor);
		
		Integer codigoGeografia = 456;
		String nombreGeografia = "Libro Geografia 1";
		String autorGeografia = "Un autor perdido";
		LibroGeografia unLibroGeografico = new LibroGeografia(codigoGeografia, nombreGeografia, autorGeografia);
		
		Integer codigoMatematico = 789;
		String nombreMatematico = "Libro Matematicas 1";
		String autorMatematico = "Un autor calculado";
		LibroMatematica unLibroMatematico = new LibroMatematica(codigoMatematico, nombreMatematico, autorMatematico);
		
		unaBiblioteca.agregarLibro(unLibroHistorico);
		unaBiblioteca.agregarLibro(unLibroGeografico);
		unaBiblioteca.agregarLibro(unLibroMatematico);
		
		
		
		Integer dni = 35141734;
		String apellido = "Medina";
		String nombreEstudiante = "Mauricio";
		Estudiante unEstudiante = new Estudiante(dni, apellido, nombreEstudiante);
		
		unaBiblioteca.estudianteExtraeLibro(unEstudiante, 123);
		unaBiblioteca.estudianteExtraeLibro(unEstudiante, 456);
		unaBiblioteca.estudianteExtraeLibro(unEstudiante, 789);
	
		
		//unaBiblioteca.estudianteDevuelveLibro(unEstudiante, 123);
		
		Integer librosDeEstudiante = 2;
		assertNotNull(unaBiblioteca);
		assertEquals(librosDeEstudiante, unEstudiante.librosPrestados(),0);
	}
	

}
