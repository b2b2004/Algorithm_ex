package com.example.algorithm_ex.Basic_02.Ex05_Binary_Search;

import java.util.Scanner;

public class Baekjoon_6236 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] useAounts = new int[N];
        for(int i=0; i<N; i++){
            useAounts[i] = sc.nextInt();
        }

        int l = 1;
        int r = N * 10000;
        int ans = -1;

        while (l <= r){
            int m = (l + r) / 2;
            if(isPossible(useAounts, m, M)){
                r = m - 1;
                ans = m;
            }else{
                l = m + 1;
            }
        }
        System.out.println(ans);
    }

    private static boolean isPossible(int[] useAounts, int drawAmount, int maxDrawCount) {
        int drawCount = 1;
        int currentAmount = drawAmount;

        for(int useAmount : useAounts){
            if(useAmount > drawAmount)
                return false;
            if(useAmount > currentAmount){
                if(drawCount == maxDrawCount)
                    return false;
                drawCount++;
                currentAmount = drawAmount;
            }
            currentAmount -= useAmount;
        }
        return true;
    }
}
