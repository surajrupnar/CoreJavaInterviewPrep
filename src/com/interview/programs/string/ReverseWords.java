package com.interview.programs.string;

public class ReverseWords {
    public static String reverseString(String word){
        String result = "";
        for(int i = word.length()-1; i>=0;i--){
            result = result + word.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "Hello program";
        System.out.println("reverseString::" + reverseString(str));
    }
}
