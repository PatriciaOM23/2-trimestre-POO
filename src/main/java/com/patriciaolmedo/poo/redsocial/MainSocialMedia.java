package com.patriciaolmedo.poo.redsocial;

import java.util.ArrayList;

public class MainSocialMedia {

	public static void main(String[] args) {
		
		
		ArrayList<Profile> profiles = new ArrayList<>();

		// Añadir perfiles directamente
		profiles.add(CreateProfile.profileTest("profile1"));
		profiles.add(CreateProfile.profileTest("profile2"));
		profiles.add(CreateProfile.profileTest("profile3"));
		profiles.add(CreateProfile.profileWithPost("profilewPost1", 2));
		profiles.add(CreateProfile.profileWithPost("profilewPost2", 5));
		profiles.add(CreateProfile.profileWithPost("profilewPost3", 0));

		
		Profile profile1 = profiles.get(0);
		Profile profile2 = profiles.get(1);
		Profile profile3 = profiles.get(2);
		Profile profileWP1 = profiles.get(3);
		Profile profileWP2 = profiles.get(4);
		Profile profileWP3 = profiles.get(5);
		
		
		System.out.println("----------------\n PROFILE1\n -------------------\n");
		profile1.showInformation();
		profile1.showPosts();
		profile1.newFollower(1240);
		System.out.println("----------------\n PROFILE2\n -------------------\n");
		profile2.showInformation();
		profile2.createPost("Post de prueba en perfil2 ");
		profile2.showPosts();
		profile2.newFollower(30);
		System.out.println("----------------\n PROFILE WITH POST 1 \n -------------------\n");
		profileWP1.showInformation();
		profileWP1.createPost("POST PRUEBA PROFILEWP1");
		profileWP1.showPosts();
		profileWP1.newFollower(20);
		System.out.println("----------------\n PROFILE WITH POST 2\n -------------------\n");
		profileWP2.showInformation();
		profileWP2.showPosts();
		profileWP2.newFollower(10);
		

	}
	

}
