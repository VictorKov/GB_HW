package com.company.geekbrains;

public class Robot implements Running, Participant, Jumping {

    private String name;
    private int maxSpeed;
    private final int maxHeight = 0;

    public Robot(String name, int maxSpeed){
        this.name = name;
        this.maxSpeed = maxSpeed;

    }

    @Override
    public boolean run(Treadmill treadmill) {
        if (treadmill.getMaxSpeed() <= this.maxSpeed) {
            System.out.println(this.name + " пробежал");
            return true;
        }else {
            System.out.print(this.name + " Не смог пробежать");
            return false;
        }
    }

    @Override
    public boolean jump(Wall wall) {
        System.out.print(this.name + " не умеет прыгать");
        return false;
    }
}
