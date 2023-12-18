package com.example.algorithm_ex.Basic_02.Ex05_Binary_Search;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_2110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        int wifi[] = new int[N];

        for(int i=0; i<N; i++)
            wifi[i] = sc.nextInt();

        Arrays.sort(wifi);
        int l = 1;
        int r = wifi[N-1] - wifi[0];
        int ans = -1;
        while (l <= r){
            int m = (l + r) / 2;
            if(count(wifi, m) >= C){
                l = m + 1;
                ans = m;
            }else{
                r = m - 1;
            }
        }
        System.out.println(ans);
    }

    private static int count(int[] wifi, int distance) {
        int postX = wifi[0];
        int count = 1;
        for(int i=0; i<wifi.length; i++){
            if(wifi[i] - postX >= distance){
                postX = wifi[i];
                count++;
            }
        }
        return count;
    }
}
