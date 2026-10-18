package com.interview.programs.stream;

import java.util.*;

import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Test {
    public static void main(String[] args) {

          Stream.of("Java","kafka", "Spring").filter(n->n.length()>4).forEach(System.out::println);


        //System.out.println(result);




    }
}
