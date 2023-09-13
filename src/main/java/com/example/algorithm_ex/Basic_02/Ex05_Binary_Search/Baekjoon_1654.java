package com.example.algorithm_ex.Basic_02.Ex05_Binary_Search;

import java.util.Scanner;

public class Baekjoon_1654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();

        int len[] = new int[K];

        for(int i=0; i<K; i++)
            len[i] = sc.nextInt();

        long meter = -1;
        long l = 1;
        long r = (1L << 31) - 1;

        while(l <= r){
            long m = (l + r) / 2;
            if(ckmeter(len, m) >= N){
                meter = m;
                l = m + 1;
            }else{
                r = m - 1;
            }
        }
        System.out.println(meter);
    }

    private static int ckmeter(int[] len, long m) {
        int sum = 0;
        for(int l : len)
            sum += l / m;
        return sum;
    }
}
