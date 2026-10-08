package com.interview.programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MultipalOccurUsinglambda {
    public static void main(String[] args) {
        System.out.println("MultipalOccurUsinglambda program");
        List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 3, 5, 2);
        Set<Integer> seen = new HashSet<>();
        list.stream().filter(n -> !seen.add(n))
                .distinct()
                .forEach(System.out::println);
    }
}
