package com.patriciaolmedo.poo.redsocial;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Post {

	private String content;
	private int numLikes;
	private LocalDateTime date;
	private final String CUSTOM_DATE_TIME_FMT = "yyyy/MM/dd HH:mm:ss";
	private final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern(CUSTOM_DATE_TIME_FMT);
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public int getNumLikes() {
		return numLikes;
	}
	
	public void setNumLikes(int numLikes) {
		this.numLikes = numLikes;
	}
	
	public LocalDateTime getDate() {
		return date;
	}
	
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	
	public String getCUSTOM_DATE_TIME_FMT() {
		return CUSTOM_DATE_TIME_FMT;
	}
	
	public DateTimeFormatter getDATE_TIME_FORMATTER() {
		return DATE_TIME_FORMATTER;
	}

	public String getFormatDateHour() {

		return date.format(DATE_TIME_FORMATTER);
	}
	public Post(String content) {
		this.content = content;
		this.date = LocalDateTime.now();
		this.numLikes = 0;
	}
	
	public void showContent() {
		
		System.out.printf("[ %s ] %s (%d likes)%n", this.formatDate(), this.content, this.numLikes);
		
		
	}
	private String formatDate() {
		return this.formatDate(DATE_TIME_FORMATTER);
    }

    private String formatDate(DateTimeFormatter formatter) {
        return date.format(formatter);
    }
    
	
	public void giveLike() {
		this.numLikes++;
	}
	
	public int showLikes(int numLikes) {
		return numLikes;
	}
	
	


	
}

