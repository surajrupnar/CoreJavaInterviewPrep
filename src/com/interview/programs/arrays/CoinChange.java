package com.interview.programs.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoinChange {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the amount:");

        List<Integer> coinsList = new ArrayList<>();
        int amount= sc.nextInt();

        int[] coins={25,10,5,1};
        int totalCoins = 0;

        for(int coin: coins){

            int count = amount/coin;

            if(count > 0){
                for (int i = 0; i < count; i++) {
                    coinsList.add(coin);
                }
                System.out.println("Coins: "+coin+ "and count: " +count);

            }

            totalCoins = totalCoins + count;
            amount = amount % coin;


        }
        System.out.println("number of coins: " +totalCoins);
        System.out.println("array of coins: " +coinsList);

        sc.close();
    }


}

