package com.patriciaolmedo.poo.basico;

public class TareaSimple {
	public int duracionEnHoras; // NOS PERMITE ACCEDER
	private String titulo; //NO NOS PERMITE ACCEDER
	protected String asignatura; //SOLO NOS PERMITE ACCEDER DESDE EL MISMO PAQUETE
	public boolean estado;
	
	
	
	// CONSTRUCTORES
	public TareaSimple(int duracionEnHoras, String titulo, boolean completado, String asignatura) {
		this.duracionEnHoras = duracionEnHoras;
		this.titulo = titulo;
		this.completado = completado;
		this.asignatura = asignatura;
		
	
	}
	
	public TareaSimple() {
		// TODO Auto-generated constructor stub
	}

	// GETTER AND SETTER 
	public int getDuracionEnHoras() {
		return duracionEnHoras;
	}
	public void setDuracionEnHoras(int duracionEnHoras) {
		this.duracionEnHoras = duracionEnHoras;
	}
	public boolean completado;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public boolean isCompletado() {
		return completado;
	}
	public void setCompletado(boolean completado) {
		this.completado = completado;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	
	public void cambiarEstado() {
		this.completado = !completado; // LE INDICO QUE ES LO CONTRARIO
	}
	
	
	
}
