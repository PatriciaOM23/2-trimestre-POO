package com.patriciaolmedo.poo.redsocial;


public class Tests {

	public static void main(String[] args) {
		System.out.print("PRUEBA CLASE PROFILE \n------------------------\n");

		
		Profile perfil1 = new Profile("Patri", "patri", "hola", "madrid");
		perfil1.createPost("Buenos dias");
		perfil1.newFollower(2124);
		perfil1.createPost("hola buenas");
		perfil1.showInformation();
		System.out.println("\nposts: ------ \n ");
		perfil1.showPosts();
		
	   System.out.print("\n PRUEBA CLASE POST \n------------------------\n");
		
		Post prueba1 = new Post("Prueba de post");
		prueba1.giveLike();
		prueba1.showContent();

		
		Post prueba2 = new Post("segundo post");
		prueba2.showContent();
		
		
	}

}
