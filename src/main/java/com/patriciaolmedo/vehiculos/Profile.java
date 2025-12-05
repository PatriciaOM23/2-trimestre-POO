package com.patriciaolmedo.vehiculos;

public class Profile {
	private String username;
	private String visibleName;
	private String userBiography;
	private String userCity;
	private int followers;
	private int posts;
	private boolean profileStatus;
	private boolean verifiedUser;
	
	public void showInformation() {
	System.out.println(this.username);
	System.out.println(this.visibleName);
	System.out.println(this.userBiography);
	System.out.println(this.userCity);
	System.out.println(this.followers);
	System.out.println(this.posts);
	System.out.println(this.profileStatus);
	System.out.println(this.verifiedUser);
	}
	
	public int newUser(int followers) {
		this.followers++;
		return followers;
	}
	
	
	
	
}
