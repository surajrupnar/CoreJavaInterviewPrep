package com.interview.programs.string;

public class ReverseTheString {

    public static String reverseString(String sentance){
        String[] words = sentance.split(" ");
        String result = "";

        for(int i = words.length-1; i>=0;i--){
            result = result + words[i]+ " ";
        }
    return result;

    }

    public static void main(String[] args) {
        String str = "hello this is the java program";
        System.out.println("reverseString::" + reverseString(str));
    }


}
