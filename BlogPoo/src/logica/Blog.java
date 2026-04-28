package logica;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Blog {
	private Map<Integer,Publicacion> publicaciones = new HashMap<>();
	private static int cantBlogs = 0;
	private int codigo;
	private String nombre;
	private String descripcion;
	private LocalDateTime fechaCreacion;
	
	public Blog(String nombre, String descripcion) {
		fechaCreacion = LocalDateTime.now();
		this.nombre = nombre;
		this.descripcion = descripcion;
		codigo = ++cantBlogs;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCodigo() {
		return codigo;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}
	
	public String mostrarPub(int codigo) {
		System.out.println("Por implementar...");
		return "";
	}
	
	public Map<Integer,String> mostrarTitulos() {
		
	}
	
}
