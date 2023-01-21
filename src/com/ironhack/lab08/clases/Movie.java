package com.ironhack.lab08.clases;

public class Movie extends Video {
    private int duration;

    public Movie(String name, int year, String director, int duration) {
        super(name, year, director);
        this.duration = duration;
    }
    public void play (String name){
        System.out.println("Movie is playing...");
    }
}
