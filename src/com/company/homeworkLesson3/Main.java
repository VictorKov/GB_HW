package com.company.homeworkLesson3;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        String[] fruit = {"привет", "пока", "зачем", "почему", "как", "зачем", "зачем", "привет", "что", "куда", "что"};
        HashMap<String, Integer> fetus = new HashMap<>();
        for (String x : fruit) {
            fetus.put(x, fetus.getOrDefault(x,0)+1);
        }
        System.out.println(fetus);


        // создаем книгу
        Phonebook book = new Phonebook();
        book.addContact("Петя", "363487");
        book.addContact("Вася", "870977");
        book.addContact("Коля", "544456");
        book.addContact("Вася", "877765");
        book.addContact("Петя", "877737");
        book.addContact("Вова", "877733");

        // ищем по имени
        book.printPhones("Петя");
        book.printPhones("Вася");
        book.printPhones("Вова");

    }



}
