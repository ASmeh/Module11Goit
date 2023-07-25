package org.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task4 {
    public Stream<Long> execute(long a,long c,long m){
        Stream<Long> stream = Stream.iterate(0L, n-> (1 * (a * n + c) % m));
        return stream;
    }
}
