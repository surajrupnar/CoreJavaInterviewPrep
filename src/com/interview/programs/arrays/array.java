package com.interview.programs.arrays;

import java.util.ArrayList;
import java.util.List;

public class array {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<String>();
        lst.add("Ajay");
        lst.add("Ajay");
        lst.add("Ajay");
        lst.add("Ajay");
        lst.add("Ajay");
        lst.add("Ajay");
        lst.add("Ajay");
        lst.add("Ajay");

        System.out.println(lst.size());
        for(int i=0;i<lst.size();i++){
            lst.remove(i);
        }
        System.out.println(lst.size());

    }
}

