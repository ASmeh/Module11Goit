package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.execute( Arrays.asList("John", "Bill", "Max", "Alex"));
        Task2 task2 = new Task2();
        task2.execute(Arrays.asList("John", "Bill", "Max", "Alex"));
        Task3 task3 = new Task3();
        task3.execute(Arrays.asList("1, 2, 0", "4, 5"));
    }
}