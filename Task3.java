package org.example;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {
    public void execute(List<String> list){
        String numbers= list.stream().
                flatMap(s -> Arrays.stream(s.split(", ")))
                .sorted()
                .collect(Collectors.joining(", "));
        System.out.println(numbers);
    }
}
