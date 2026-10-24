package com.interview.programs.stream;

import java.net.Inet4Address;

import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;

public class RemoveDuplicateElement {
    public static void main(String[] args) {

        Stream<Double> randamvalue = Stream.generate(Math::random).limit(5);
        randamvalue.forEach(System.out::println);

     }
}
