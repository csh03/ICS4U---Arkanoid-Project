package com.company;

public class Paddle {
    private int boxx, boxy;
    private int boxw, boxh;
    public Paddle(int boxw){
        this.boxw = boxw;
        boxh=15;
        boxx=350;
        boxy=490;
    }

    public void moveRight(int dist){
        if(boxx+dist<=714) {
            boxx += dist;
        }
        else{
            boxx+=714-boxx;
        }
    }

    public void moveLeft(int dist){
        if(boxx-dist>=0){
            boxx-=dist;
        }
        else{
            boxx=0;
        }
    }
    //accessor methods
    public int getX(){
        return boxx;
    }
    public int getY(){
        return boxy;
    }
    public int getH(){
        return boxh;
    }
    public int getW(){
        return boxw;
    }
}
