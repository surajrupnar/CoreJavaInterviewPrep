package com.interview.programs;

public class TwoSumWithNonSortedArray {

    public static void main(String[]  args){
        int[] arr = {3,2,4,3};
        int target = 6;
        int[] result = twoSum(arr, target);
        System.out.print(result[0] + " " + result[1]);

    }

    //Time complexity: O(n^2)
    // Space complexity: O(1)
   public static int[] twoSum(int[] arr, int target){
        for(int j = 1; j<arr.length;j++){
            System.out.println("j: " + arr[j]);
            for(int i = 0; i < j; i++){
                System.out.println("i: " + arr[i]);
                if(arr[j] + arr[i] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1};
    }
}
