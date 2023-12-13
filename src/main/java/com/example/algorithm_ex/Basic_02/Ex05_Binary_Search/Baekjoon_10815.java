package com.example.algorithm_ex.Basic_02.Ex05_Binary_Search;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_10815 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int card[] = new int[N];

        for(int i=0; i<N; i++){
            card[i] = sc.nextInt();
        }

        int M = sc.nextInt();
        int result[] = new int[M];
        Arrays.sort(card);

        for(int i=0; i<M; i++){
            int num = sc.nextInt();
            result[i] = Binary(card, N, num);
        }

        for(int re : result){
            System.out.print(re + " ");
        }

    }

    static int Binary(int[] card, int N, int num){
        int l = 0;
        int r = N-1;
        int mid = 0;

        while (l <= r){
            mid = (l + r) / 2;

            if(card[mid] == num){
                return 1;
            }

            if(card[mid] < num){
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }

        return 0;
    }
}
