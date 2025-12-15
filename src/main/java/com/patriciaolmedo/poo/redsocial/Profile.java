package com.patriciaolmedo.poo.redsocial;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Profile {

	private String username;
	private String visibleName;
	private String userBiography;
	private String userCity;
	private int followers;
	private int numPosts;
	private ProfileStatus profileStatus; // CAMBIAR
	private boolean currentStatus;
	private boolean verifiedUser; // CAMBIAR
	private List<Post> postList; 
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getVisibleName() {
		return visibleName;
	}

	public void setVisibleName(String visibleName) {
		this.visibleName = visibleName;
	}

	public String getUserBiography() {
		return userBiography;
	}

	public void setUserBiography(String userBiography) {
		this.userBiography = userBiography;
	}

	public String getUserCity() {
		return userCity;
	}

	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}

	public int getFollowers() {
		return followers;
	}

	public void setFollowers(int followers) {
		this.followers = followers;
	}

	public int getNumPosts() {
		return numPosts;
	}

	public void setNumPosts(int numPosts) {
		this.numPosts = numPosts;
	}

	public ProfileStatus getProfileStatus() {
		return profileStatus;
	}

	public void setProfileStatus(ProfileStatus profileStatus) {
		this.profileStatus = profileStatus;
	}

	public boolean isVerifiedUser() {
		return verifiedUser;
	}

	public void setVerifiedUser(boolean verifiedUser) {
		this.verifiedUser = verifiedUser;
	}

	public List<Post> getPostList() {
		return postList;
	}

	public void setPostList(List<Post> postList) {
		this.postList = postList;
	}

	
	public Profile(String username, String visibleName, String userBiography, String userCity) {
		this.postList = new ArrayList<Post>();
		this.username =  username;
		this.visibleName = visibleName;
		this.userBiography = userBiography;
		this.userCity = userCity;
		
	}
	
	
	public void showInformation() {
		System.out.println("Usuario: " + this.username);
		System.out.println("Nombre visible: " + this.visibleName);
		System.out.println("Biografía: " + this.userBiography);
		System.out.println("Lugar: " + this.userCity);
		System.out.println("Seguidores: " + this.followers);
		System.out.println("Posts: " + this.numPosts);
		System.out.println("Estado perfil: " + this.profileStatus);
		System.out.println("Usuario verificado: " + this.verifiedUser);
	}

	public void newFollower(int followers) {
		this.followers += this.followers;

	}


	public boolean isActive() {
		boolean currentStatus =  this.profileStatus == ProfileStatus.ACTIVE;
		return currentStatus;

	}
	
	public void createPost(String content) {
		// El arraylist lo hemos creado ya arriba
		this.postList.add(new Post(content)); 
		numPosts++;
		
	}
	
	public void showPosts() {	
	        postList.forEach(post -> {
	            post.showContent();
	            
	        });
		
	}
	}
	
	
	

