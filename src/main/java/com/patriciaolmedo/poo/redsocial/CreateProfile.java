package com.patriciaolmedo.poo.redsocial;

import java.util.Locale;

import com.github.javafaker.Faker;

public class CreateProfile {
	// public Profile(String username, String visibleName, String userBiography,
	// String userCity)

	public static Profile profileTest() {
		Faker faker = new Faker(Locale.forLanguageTag("es"));
		Profile profileTest = new Profile(faker.name().username(), faker.name().fullName(),
				faker.shakespeare().hamletQuote(), faker.address().city());

		return profileTest;

	}

	public static Profile profileWithPost(int posts) {
		Faker faker = new Faker(Locale.forLanguageTag("es"));
		Profile profileWithPost = profileTest();

		for (int i = 0; i < posts; i++) {

			profileWithPost.createPost(faker.leagueOfLegends().quote());
		}

		return profileWithPost;
	}

}
//	public static Profile profileTest (String username){
// 	public Profile(String username, String visibleName, String userBiography, String userCity) 
//		Profile profileTest = new Profile(username, "profileTest","Prepared profile", "Madrid");
//		
//		return profileTest;
//		
//		
//	}

//	public static Profile profileWithPost (String username, int posts) {
//		Profile profileWithPost = profileTest(username);
//		for(int i = 0; i < posts; i++) {
//			
//			profileWithPost.createPost("new post" + i);
//		}
//		
//		
//		return profileWithPost;
//	}
//	
//}
