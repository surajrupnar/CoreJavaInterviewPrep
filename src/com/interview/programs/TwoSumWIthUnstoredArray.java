package com.interview.programs;

import java.util.HashMap;
import java.util.Map;

public class TwoSumWIthUnstoredArray {
    public static void main(String[] args) {
        int[] arr = {4, 1, 6, 2, 3};
        int target = 6;

        int[] result = twoSumForUnstoredArray(arr, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }

    public static int[] twoSumForUnstoredArray(int[] arr, int target) {;
        Map<Integer,Integer> map =  new HashMap<>();

        for(int i = 0;i < arr.length; i++){
            int complement = target - arr[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{-1,-1};
    }
}
