package com.patriciaolmedo.poo.redsocial;


public class Tests {

	public static void main(String[] args) {
		System.out.print("PRUEBA CLASE PROFILE \n------------------------\n");

		
		Profile perfil1 = new Profile("Patri", "patri", "puta", "madrid");
		perfil1.createPost("Buenos dias");
		perfil1.showPosts();
		
		
		
	   System.out.print("PRUEBA CLASE POST \n------------------------\n");
		
		Post prueba1 = new Post("Me cago en to");
		prueba1.giveLike();
		prueba1.showContent();
		
	}

}
