package com.patriciaolmedo.poo.redsocial;

import java.time.LocalDate;

public class Publicacion {
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
	
	

}
