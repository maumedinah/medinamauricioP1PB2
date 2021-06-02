package ar.edu.unlam;

public class Libro {
	
	private Integer codigo;
	private String nombre;
	private String autor;
	private Estudiante prestado;
	private Boolean estaPrestado;

	public Libro(Integer codigo, String nombre, String autor) {
		this.setCodigo(codigo);
		this.setNombre(nombre);
		this.setAutor(autor);
		this.prestado = null;
		this.estaPrestado = false;
	}

	private void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Integer getCodigo() {
		return this.codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void prestadoA(Estudiante unEstudiante) {
		this.prestado = unEstudiante;
		this.estaPrestado = true;
	}
	
	public Boolean estaPrestado() {
		return this.estaPrestado;
	}

	public void devuelve() {
		this.prestado = null;
		this.estaPrestado = false;
	}

}
