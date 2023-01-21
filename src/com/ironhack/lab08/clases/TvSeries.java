package com.ironhack.lab08.clases;

public class TvSeries extends Video{

    private int seasons;

    public int numberSeasons(String name){
        return seasons;
    }

    public void play (String name){
        System.out.println("Serie is playing...");
    }

    public TvSeries(String name, int year, String director, int seasons) {
        super(name, year, director);
        this.seasons = seasons;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }
}
