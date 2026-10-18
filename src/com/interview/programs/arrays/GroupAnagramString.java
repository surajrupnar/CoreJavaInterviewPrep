package com.interview.programs.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupAnagramString {

    /*Input: arr[] = ["act", "god", "cat", "dog", "tac"]
    Output: [["act", "cat", "tac"], ["god", "dog"]]*/

    public static void main(String[] args) {
        List<String> anagram= Arrays.asList("act", "god", "cat", "dog", "tac");
        Map<String, List<String>> result =  anagram.stream()
                .collect(Collectors.groupingBy(charWord->
                {char[] chars = charWord.toCharArray();
                Arrays.sort(chars);
                return new String(chars);
                }));

        System.out.println(result.values());
    }

}
