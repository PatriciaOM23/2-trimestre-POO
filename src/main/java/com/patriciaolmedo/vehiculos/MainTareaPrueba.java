package com.patriciaolmedo.vehiculos;
import com.patriciaolmedo.poo.basico.TareaSimple;
public class MainTareaPrueba {
	public static void  main(String[] args) {
	
	TareaSimple objeto1 = new TareaSimple();
		
		objeto1.setDuracionEnHoras(1);
		System.out.println(objeto1.getDuracionEnHoras());
		
		TareaSimple objeto2 = new TareaSimple();
		objeto2.setTitulo("Paso a tablas");;
		System.out.println(objeto2.getTitulo());
		
		TareaSimple objeto3 = new TareaSimple();
		objeto3.setCompletado(true);
		objeto3.cambiarEstado();
		System.out.println(objeto3.isCompletado());
		
		TareaSimple objeto4 = new TareaSimple();
		objeto4.setAsignatura("Base de datos");
		System.out.println(objeto4.getAsignatura());
		
		
		int duracionEnHoras = objeto1.duracionEnHoras;
		
		

	}

		
		
	}

