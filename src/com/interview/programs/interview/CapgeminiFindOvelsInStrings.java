package com.interview.programs.interview;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.Stream;

public class CapgeminiFindOvelsInStrings {
    public static void main(String[] args) {

        Stream<Double> randamValue = Stream.generate(Math::random).limit(5);
       randamValue.forEach(System.out::println);
    }
}
