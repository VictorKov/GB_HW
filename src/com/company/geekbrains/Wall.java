package com.company.geekbrains;

public class Wall implements Obstacle {

    private int maxHeight;

    public Wall(int maxHeight){
        this.maxHeight = maxHeight;
    }

    public int getMaxHeight(){
        this.maxHeight = maxHeight;
        return maxHeight;
    }
}
