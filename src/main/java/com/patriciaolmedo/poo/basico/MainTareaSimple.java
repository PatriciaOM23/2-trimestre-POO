package com.patriciaolmedo.poo.basico;

import java.util.Scanner;

public class MainTareaSimple {

	public static void main(String[] args) {
		
		TareaSimple objeto1 = new TareaSimple();
		
		objeto1.setDuracionEnHoras(2);
		System.out.println(objeto1.getDuracionEnHoras());
		
		TareaSimple objeto2 = new TareaSimple();
		objeto2.setTitulo("Ejercicios java");;
		System.out.println(objeto2.getTitulo());
		
		TareaSimple objeto3 = new TareaSimple();
		objeto3.setCompletado(false);
		objeto3.cambiarEstado();
		System.out.println(objeto3.isCompletado());
		
		TareaSimple objeto4 = new TareaSimple();
		objeto4.setAsignatura("Programación");
		System.out.println(objeto4.getAsignatura());
	
		int duracionEnHoras = objeto1.duracionEnHoras;
		
		

	}

}
