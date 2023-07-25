package org.example;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.execute( Arrays.asList("John", "Bill", "Max", "Alex"));
        Task2 task2 = new Task2();
        task2.execute(Arrays.asList("John", "Bill", "Max", "Alex"));
        Task3 task3 = new Task3();
        task3.execute(Arrays.asList("1, 2, 0", "4, 5"));
        Task4 task4 = new Task4();
        Stream<Long> stream =task4.execute(25214903917L,11,1L << 48);
        System.out.println(stream.limit(10).collect(Collectors.toList()));
        Stream<Integer> stream1 = Task5.zip(Arrays.asList(1,2,3,4,5).stream(),Arrays.asList(6,7,8,9,10).stream());
        System.out.println(stream1.collect(Collectors.toList()));
    }
}