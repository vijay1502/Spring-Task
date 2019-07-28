package com.stackroute;

public class Movie {
    private String movieName;
    private Actor actor;

    public Movie(String movieName, Actor actor) {
        this.movieName = movieName;
        this.actor = actor;
    }

    public Movie() {
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", actor=" + actor +
                '}';
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

}
