package org.example;
import java.util.List;
import java.util.stream.Stream;

public class Task3 {
    public void execute(List<String> list){
        Stream<String> stream = list.stream().
                                    map(line->line.split(" ,"));
    }
}
