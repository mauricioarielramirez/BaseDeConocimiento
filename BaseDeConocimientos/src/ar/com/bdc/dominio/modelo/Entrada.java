package ar.com.bdc.dominio.modelo;

public class Entrada {
	private Long idEntrada;
	private String titulo;
	private String descripcion;
	private String keyword;
	
	public Entrada() {
		super();
	}
	
	public Entrada(Long idEntrada, String titulo, String descripcion, String keyword) {
		super();
		this.idEntrada = idEntrada;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.keyword = keyword;
	}
	
	public Long getIdEntrada() {
		return idEntrada;
	}
	
	public void setIdEntrada(Long idEntrada) {
		this.idEntrada = idEntrada;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String getKeyword() {
		return keyword;
	}
	
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
}
