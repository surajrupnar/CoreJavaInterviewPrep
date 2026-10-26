package com.interview.programs.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CoforgeCoins {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Amount:: ");
        int amount = sc.nextInt();

        int [] coins={25,10,5,1};
        int totlaCoins = 0;
        List<Integer> currencyList = new ArrayList<>();

        for(int coin: coins){
            int count = amount/coin;
            if(count > 0){
                for(int i = 0; i < count; i++){
                    currencyList.add(coin);
                }
            }

            totlaCoins = totlaCoins + coin;
            amount = amount % coin;

        }
        System.out.println("array of coins: " +currencyList);
    }
}
