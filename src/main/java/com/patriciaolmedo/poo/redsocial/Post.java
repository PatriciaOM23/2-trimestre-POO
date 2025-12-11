package com.patriciaolmedo.poo.redsocial;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Post {
	private String content;
	private LocalDateTime date = LocalDateTime.now();;
	private int numLikes;
	private final String CUSTOM_DATE_TIME_FMT = "yyyy/MM/dd hh:mm:ss";
	private DateTimeFormatter datePost = DateTimeFormatter.ofPattern(CUSTOM_DATE_TIME_FMT);
	private String dtfPost = date.format(datePost);
	
	public Post(String content) {
		this.content = content;
		this.numLikes = 0;
	}
	
	public void showContent() {
		System.out.println(content);
		System.out.println(dtfPost);
		System.out.println(numLikes);
		
	}
	
	public void giveLike() {
		this.numLikes++;
	}
	
	public int showLikes(int numLikes) {
		return numLikes;
	}
	
	


	
}

