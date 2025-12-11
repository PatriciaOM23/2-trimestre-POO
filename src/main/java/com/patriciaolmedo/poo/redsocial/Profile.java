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
	private boolean verifiedUser; // CAMBIAR
	private List<Post> postList; 
	
	public Profile(String username, String visibleName, String userBiography, String city) {
		this.postList = new ArrayList<Post>();
		this.username =  username;
		this.visibleName = visibleName;
		this.userBiography = userBiography;
		this.userCity = city;
		
	}
	
	public void showInformation() {
		System.out.println(this.username);
		System.out.println(this.visibleName);
		System.out.println(this.userBiography);
		System.out.println(this.userCity);
		System.out.println(this.followers);
		System.out.println(this.numPosts);
		System.out.println(this.profileStatus);
		System.out.println(this.verifiedUser);
	}

	public void newFollower(int followers) {
		this.followers++;

	}

	public void changeStatus(ProfileStatus profileStatus, boolean currentStatus) {
		if (currentStatus) {
			this.profileStatus = ProfileStatus.BLOCKED;
		} else if (this.profileStatus == ProfileStatus.PENDING_CONFIRMATION) {
			this.profileStatus = ProfileStatus.ACTIVE;
		} else {
			this.profileStatus = ProfileStatus.BLOCKED;
		}

	}

	public boolean isActive(ProfileStatus profileStatus) {
		boolean currentStatus =  this.profileStatus == ProfileStatus.ACTIVE;
		return currentStatus;

	}
	
	public void createPost(String content) {
		// El arraylist lo hemos creado ya arriba
		this.postList.add(new Post(content)); 
		numPosts++;
		
	}
	
	public void showPosts() {
		for(Post i : postList) {
			i.showContent();
			
		
		}
	}
	
	
	
}
