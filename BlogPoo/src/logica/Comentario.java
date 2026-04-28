package logica;

import java.time.LocalDateTime;

public class Comentario {
	private LocalDateTime fechaCreacion;
	private String autor;
	private String dirIP;
	private String texto;
	
	public Comentario(String autor, String dirIP, String texto) {
		fechaCreacion = LocalDateTime.now();
		this.autor = autor;
		this.dirIP = dirIP;
		this.texto = texto;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public String getAutor() {
		return autor;
	}

	public String getDirIP() {
		return dirIP;
	}

	public String getTexto() {
		return texto;
	}

	@Override
	public String toString() {
		return "Comentario [fechaCreacion=" + fechaCreacion + ", autor=" + autor + ", dirIP=" + dirIP + ", texto="
				+ texto + "]";
	}
	

}
