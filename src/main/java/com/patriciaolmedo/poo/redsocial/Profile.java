package com.patriciaolmedo.poo.redsocial;

import java.util.ArrayList;
import java.util.List;

public class Profile {

	private String username;
	private String visibleName;
	private String userBiography;
	private String userCity;
	private int followers;
	private int posts;
	private ProfileStatus profileStatus; // CAMBIAR
	private boolean verifiedUser; // CAMBIAR
	private List<Posts> dposts; 

	
	public Profile() {
		this.dposts = new ArrayList<Posts>();
	}
	
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

}
