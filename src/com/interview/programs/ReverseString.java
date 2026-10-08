package com.interview.programs;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reverseString(str));
    }

    public static String reverseString(String str) {
        String result = "";
        for(int i = str.length()-1;i>=0;i--){
            result = result + str.charAt(i);

        }
        return result;
    }
}
