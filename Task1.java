package org.example;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*Завдання 1
Метод приймає на вхід список імен. Необхідно повернути рядок вигляду 1. Ivan, 3. Peter... лише з тими іменами, що стоять під непарним індексом (1, 3 тощо)*/
public class Task1 {
    public List<String> execute(List<String> list){
        Stream<String> names = IntStream.range(0,list.size())
                        .filter(i->i%2==1)
                        .mapToObj(list::get)
                        .map(name-> (list.indexOf(name)+". "+name));
        List<String> res = names.collect(Collectors.toList());
        System.out.println(res);
        return res;
    }
}
