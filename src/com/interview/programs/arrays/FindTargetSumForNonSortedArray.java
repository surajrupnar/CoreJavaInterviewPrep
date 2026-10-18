package com.interview.programs.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindTargetSumForNonSortedArray {

    public static int[] twoSum(int[] arr, int target){

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){

            int complement = target - arr[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(arr[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 6, 2, 3};
        int target = 5;

        int[] result = twoSum(arr, target);
        System.out.println("Indices: " + Arrays.toString(result));
    }
}
