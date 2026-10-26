package com.interview.programs.prac;

import com.interview.programs.Singleton;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

       Integer result = Stream.of(1, 2, 3, 4, 5, 10).mapToInt(Integer::intValue).   reduce(0, Integer::sum);

        System.out.println(result);
    }
}
