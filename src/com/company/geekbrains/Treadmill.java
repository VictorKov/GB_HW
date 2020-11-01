package com.company.geekbrains;

public class Treadmill implements Obstacle {

    private int maxSpeed;

    public Treadmill(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }
}
