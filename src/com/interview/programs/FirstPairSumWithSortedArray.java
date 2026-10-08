package com.interview.programs;

public class FirstPairSumWithSortedArray {
    public static void main(String[]  args){
        int[] arr = {3,2,4,3};
        //int[] arr = {1, 2, 3, 4, 6, 8};
        int target = 6;
        int[] result = new FirstPairSumWithSortedArray().findFistPair(arr, target);
        System.out.print(result[0] + " " + result[1]);

    }

    //Time complexity: O(n^2)
    // Space complexity: O(1)
   /*public int[] findFistPair(int[] arr, int target){
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
    }*/

    //works with sorted array
    //time complexity: O(n) and Space: O(1) achieved
    public int[] findFistPair(int[] arr, int target){
        int low = 0;
        int high = arr.length -1;
        while(low < high){

            if(arr[low] + arr[high] == target){
                return new int[]{low, high};
            }else if(arr[low] + arr[high] < target){
                low++;
            }else{
                high--;
            }
        }
        return new int[]{-1};
    }
}
