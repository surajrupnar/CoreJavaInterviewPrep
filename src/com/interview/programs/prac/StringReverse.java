package com.interview.programs.prac;

public class StringReverse {
    public static void main(String[] args) {
        String str = "Hello";

        int left = 0;
        int right = str.length() - 1;
        StringBuilder reverseString = new StringBuilder();

        for(int i = str.length() -1; i >= 0; i-- ){
            reverseString.append(str.charAt(i));
        }
        System.out.println("reverseString::" + reverseString);
    }
}
