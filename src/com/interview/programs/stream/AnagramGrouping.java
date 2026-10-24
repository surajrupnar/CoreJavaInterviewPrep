package com.interview.programs.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class AnagramGrouping {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("act", "god", "cat", "dog", "tac");

        Map<String,List<String>> result  = stringList.stream().collect(Collectors.groupingBy( str ->{
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            return new String(chars);
        }));
        System.out.println(result.values());
    }
}
