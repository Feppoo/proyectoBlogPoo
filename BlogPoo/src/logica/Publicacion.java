package logica;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Publicacion {
	private List<Comentario> comentarios = new ArrayList<>();
	private static int cantPubs;
	private int codPub;
	private String titulo;
	private String texto;
	private String creador;
	private LocalDateTime fechaPub;
	
	public Publicacion(String titulo, String texto, String creador) {
		fechaPub = LocalDateTime.now();
		this.titulo = titulo;
		this.texto = texto;
		this.creador = creador;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getTexto() {
		return texto;
	}

	public String getCreador() {
		return creador;
	}

	public LocalDateTime getFechaPub() {
		return fechaPub;
	}
	
	public boolean agregarCom(Comentario com) {
		System.out.println("Por implementar...");
		return true;
	}
	
	public boolean borrarCom(Comentario com) {
		System.out.println("Por implementar...");
		return true;
	}

	@Override
	public String toString() {
		return "Publicacion [comentarios=" + comentarios + ", codPub=" + codPub + ", titulo=" + titulo + ", texto="
				+ texto + ", creador=" + creador + ", fechaPub=" + fechaPub + "]";
	}
	
}
