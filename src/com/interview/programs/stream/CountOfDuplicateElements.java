package com.interview.programs.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOfDuplicateElements {
    public static void main(String[] args) {
        List<Integer> listElements = Arrays.asList(1, 1, 2, 2, 3, 4, 4);

        Map<Integer, Long> frequencyMap = listElements.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting() ));

        frequencyMap.entrySet().stream().filter(entry -> entry.getValue() > 1).forEach(entry -> System.out.println("Element: " + entry.getKey() + ", Count: " + entry.getValue()));
    }
}
