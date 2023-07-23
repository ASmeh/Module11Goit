package org.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {
    public void execute(List<String> list){
            List<String> res =list.stream().
                    map(name->name.toUpperCase()).
                    sorted((name1,name2)->name1.compareTo(name2)).
                    collect(Collectors.toList());
            System.out.println(res);

    }
}
