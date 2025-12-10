package com.patriciaolmedo.poo.redsocial;

import java.time.LocalDate;

public class Posts {
	private String content;
	private LocalDate date;
	private int numLikes;
	
	
	
	public void showContent() {
		System.out.println(this.content);
	}
	
	public void giveLike() {
		this.numLikes++;
	}
	
	public int showLikes(int numLikes) {
		return numLikes;
	}
	
	
//	public void showPost (String content, LocalDate date, int numLikes) {
//		System.out.printf("Contenido: %s%nFecha: %s%nLikes: %d",content, date, numLikes);
//		
//	}

	
}

