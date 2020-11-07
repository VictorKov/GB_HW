package com.company.Homework2;

import com.sun.org.apache.xpath.internal.objects.XString;

import static java.lang.Integer.parseInt;

public class Main {

   private static String[][] arr = new String[3][4];



    public static void main(String[] args) {

        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                arr[i][j] = String.valueOf(i*j);
            }
        }

        int sum = 0;

        try {
           sum =  method(arr);
            System.out.println("Сумма всех элементов равна " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();

        }
    }


    public static int method(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i].length != 4 || arr.length !=4) {
                    throw new MyArraySizeException("Размер массива не [4][4]");
                }
                    try {
                        count += parseInt(arr[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(i, j);
                    }
                }
            }


        return count;
    }

}
