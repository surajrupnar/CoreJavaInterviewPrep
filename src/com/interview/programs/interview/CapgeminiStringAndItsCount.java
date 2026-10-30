package com.interview.programs.interview;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CapgeminiStringAndItsCount {
    public static void main(String[] args) {
        String str = "oquwyerbjhjsdfjjhkaf";

        String result = str.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()))
                .entrySet()
                .stream()
                .map(entry->entry.getKey()+ "" +entry.getValue())
                .collect(Collectors.joining());
        System.out.println(result);
    }
}
