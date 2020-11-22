package com.company.homeworkLesson5;

public class homeworkLesson5 {

    static final int size = 10000000;
    static final int h = size / 2;

    public static void main(String[] args) {

        float[] arr = new float[size];

        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }


        methodHaveOneThread(arr);

        System.out.println("===============");

        methodHaveTwoThread(arr);

    }
    public static void methodHaveOneThread(float arr[]){

        System.out.println("Начало работы метода с одним потоком");

        long a = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.out.println(System.currentTimeMillis() - a);

        System.out.println("Конец работы метода с одним потоком");
    }

    public static void methodHaveTwoThread(float arr[]){

        float[] arr1 = new float[h];
        float[] arr2 = new float[h];


        System.out.println("Начало работы метода с двумя потоками");

        long a = System.currentTimeMillis();

        System.arraycopy(arr, 0, arr1, 0, h);
        System.arraycopy(arr, h, arr2, 0, h);


       Thread t1 = new Thread(new Runnable() {
           @Override
           public void run() {
               for (int i = 0; i < arr1.length; i++) {
                   arr[i] *= Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2);
               }
           }

        });
       Thread t2 = new Thread(new Runnable() {
           @Override
           public void run() {
               for (int i = 0; i < arr2.length; i++) {
                   arr[i] *= Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2);
               }
           }
       });

       t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(arr1, 0, arr, 0, h);
        System.arraycopy(arr2, 0, arr, h, h);


        System.out.println(System.currentTimeMillis() - a);


        System.out.println("Конец работы метода с двумя потоками");



    }
}
