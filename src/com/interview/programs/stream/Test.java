package com.interview.programs.stream;

import java.util.*;
import java.util.stream.Collectors;


public class Test {

   public static boolean isPalindrome(String str){
       int left = 0;
       int right = str.length() - 1;

       while(left < right){

           if(str.charAt(left) != str.charAt(right)){
               return false;
           }
           else{
               left++;
               right--;
           }
       }
       return true;
   }

    public static void main(String[] args) {
        String str = "Suraj";

        str.toLowerCase()
                .chars()
                .filter(ch->"aeiou".indexOf(ch)>=0)
                .forEach(ch->System.out.println((char) ch));
    }
}

