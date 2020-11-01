package com.company.geekbrains;

public class Man implements Jumping, Running, Participant {

    private String name;
    private int maxSpeed;
    private int maxHeight;

    public Man(String name, int maxSpeed, int maxHeight){

        this.name = name;
        this.maxSpeed = maxSpeed;
        this.maxHeight = maxHeight;

    }

    @Override
    public boolean jump(Wall wall) {
        if (wall.getMaxHeight() <= this.maxHeight) {
            System.out.println(this.name + " Перепрыгнул");
            return true;
        }else {
            System.out.print(this.name + " не смог перепрыгнуть");
            return false;
        }

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
}
