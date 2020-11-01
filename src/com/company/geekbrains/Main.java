package com.company.geekbrains;

public class Main {


    public static void main(String[] args) {
	// write your code here



        Participant[] participants = {
                new Cat("Базилио",120,40),
                new Man("Василий", 23,30),
                new Robot("Терминатор", 20)
        };

        Obstacle[] obstacles = {
                new Treadmill(15),
                new Wall(34),
                new Treadmill(100),
                new Wall(23)
        };

        challenge(participants,obstacles);

    }

    public static void challenge(Participant[] participants, Obstacle[] obstacles){

        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                if (obstacle instanceof Wall) {
                    if (((Jumping) participant).jump((Wall) obstacle)) {
                    } else {
                        System.out.println(" - выбыл");
                        break;
                    }

                } else if (obstacle instanceof Treadmill) {
                    if (((Running) participant).run((Treadmill) obstacle)) {
                    } else {
                        System.out.println(" - выбыл");
                        break;
                    }
                }
            }
        }
}



    }

