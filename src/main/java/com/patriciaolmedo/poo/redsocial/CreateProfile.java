package com.patriciaolmedo.poo.redsocial;

public class CreateProfile {
	public static Profile profileTest (String username){
	Profile profileTest = new Profile(username, "profileTest","Prepared profile", "Madrid");
	
	return profileTest;
	
	
	}
	
	public static Profile profileWithPost (String username, int posts) {
		Profile profileWithPost = profileTest(username);
		for(int i = 0; i < posts; i++) {
			
			profileWithPost.createPost("new post" + i);
		}
		
		
		return profileWithPost;
	}
	
}
