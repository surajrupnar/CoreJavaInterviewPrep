package com.interview.programs.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateElement {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 1, 2, 2, 3, 4, 4);
            Set<Integer> set =  new HashSet<>();
        arr.stream().filter(n -> !set.add(n)).distinct().forEach(System.out::println);
    }
}
