package com.example.algorithm_ex.Basic_02.Ex05_Binary_Search;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_2512 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int area[] = new int[N];
        int sum = 0;

        for(int i=0; i<N; i++){
            area[i] = sc.nextInt();
            sum += area[i];
        }

        Arrays.sort(area);
        int M = sc.nextInt();
        int money = 0;

        if(M >= sum){
            System.out.println(area[N-1]);
            return;
        }

        int l = 1;
        int r = M;
        while (l <= r){
            int mid = (l + r) / 2;
            if(solve(area, mid, N, M)){
                l = mid + 1;
                money = mid;
            }else{
                r = mid - 1;
            }

        }
        System.out.println(money);


    }

    private static boolean solve(int[] area, int mid, int N, int M) {
        int solveSum = 0;
        for(int i=0; i<N; i++){
            if(area[i] > mid){
                solveSum += mid;
            }else{
                solveSum += area[i];
            }
        }
        // 2 2 2 2 2
        if(solveSum <= M){
            return true;
        }else{
            return false;
        }
    }

}
