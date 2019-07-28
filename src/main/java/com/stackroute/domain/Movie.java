package com.stackroute.domain;

import com.stackroute.domain.Actor;

public class Movie {

    Actor actor1;
    Actor actor2;
    Actor actor3;



    public Movie() {
    }

    public Movie(Actor actor1,Actor actor2, Actor actor3) {
        this.actor1 = actor1;
        this.actor2 = actor2;
        this.actor3 = actor3;
    }

    public Actor getActor1() {
        return actor1;
    }

    public void setActor1(Actor actor1) {
        this.actor1 = actor1;
    }

    public Actor getActor2() {
        return actor2;
    }

    public void setActor2(Actor actor2) {
        this.actor2 = actor2;
    }

    public Actor getActor3() {
        return actor3;
    }

    public void setActor3(Actor actor3) {
        this.actor3 = actor3;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "actor1=" + actor1 +
                ", actor2=" + actor2 +
                ", actor3=" + actor3 +
                '}';
    }

}
