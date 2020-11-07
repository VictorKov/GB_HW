package com.company.Homework2;

public class MyArrayDataException extends Exception {
    public int i;
    public int j;

    MyArrayDataException(int i, int j) {
        this.j = j;
        this.i = i;

    }
}
