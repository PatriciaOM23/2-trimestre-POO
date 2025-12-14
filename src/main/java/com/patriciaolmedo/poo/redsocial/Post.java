package com.patriciaolmedo.poo.redsocial;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Post {
    private static final String CUSTOM_DATE_TIME_FMT = "yyyy/MM/dd hh:mm:ss";
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern(CUSTOM_DATE_TIME_FMT);

    private String content;
    private int numLikes;
    private LocalDateTime date;

    public Post(String content) {
        this.content = content;
        this.date = LocalDateTime.now();
        this.numLikes = 0;
    }

    public void showContent() {
        System.out.println(content);
        System.out.println(this.formatDate());
        System.out.println(numLikes);
    }

    public String formatDate() {
		return this.formatDate(DATE_TIME_FORMATTER);
    }

    public String formatDate(DateTimeFormatter formatter) {
        return date.format(formatter);
    }

    public void totalLikes() {
        this.numLikes++;
    }

    public int showLikes(int numLikes) {
        return numLikes;
    }


}

