package com.interview.programs;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3,};
        System.out.println(removeDuplicateElements(arr));
    }

    public static int removeDuplicateElements(int[] arr){
        if(arr.length == 0){
            return 0;
        }

        int slow = 0;
        for(int fast = 1; fast < arr.length; fast++){
            if(arr[fast] != arr[slow]){
                slow++;
                arr[slow] = arr[fast];
            }
        }
        return slow + 1;
    }
}
