package org.example;
import java.util.Iterator;
import java.util.Random;
import java.util.stream.Stream;
public class Task5 {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Stream.Builder<T> streamBuilder = Stream.builder();
        Random rd = new Random();
        Iterator<T> iterator1 = first.iterator();
        Iterator<T> iterator2 = second.iterator();
        while(iterator1.hasNext() && iterator2.hasNext()){
            if(rd.nextBoolean()){
                streamBuilder.add(iterator1.next());
            }
            else {
                streamBuilder.add(iterator2.next());
            }
        }
        return streamBuilder.build();
    }
}
