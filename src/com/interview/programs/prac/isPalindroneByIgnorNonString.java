package com.interview.programs.prac;

public class isPalindroneByIgnorNonString {

    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length() - 1;

        while(left < right){
            if(!Character.isLetterOrDigit(str.charAt(left))){
                left++;
                continue;
            }

            if(!Character.isLetterOrDigit(str.charAt(right))){
                right--;
                continue;
            }

            if(Character.toLowerCase(str.charAt(left)) !=  Character.toLowerCase(str.charAt(right))){
                return false;
            }else {
                left++;
                right--;
            }
        }
       return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("hello"));
        System.out.println(isPalindrome("race@car!"));
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
