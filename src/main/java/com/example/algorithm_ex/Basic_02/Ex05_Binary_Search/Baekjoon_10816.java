package com.example.algorithm_ex.Basic_02.Ex05_Binary_Search;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_10816 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int M = sc.nextInt();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(M-- > 0){
            int x = sc.nextInt();
            int lowerBoundIndex = findLowerBoundIndex(x, arr);
            int upperBoundIndex = findUpperBoundIndex(x, arr);
            bw.write(upperBoundIndex - lowerBoundIndex + " ");
        }
        bw.write("\n");
        bw.flush();

    }

    private static int findUpperBoundIndex(int x, int[] arr) {
        int upperBoundIndex = arr.length;
        int l = 0;
        int r = arr.length - 1;
        while(l <= r){
            int m = (l + r) / 2;
            if(arr[m] <= x){
                l = m + 1;
            }else{
                r = m - 1;
                upperBoundIndex = m;
            }
        }
        return upperBoundIndex;
    }

    private static int findLowerBoundIndex(int x, int[] arr) {
        int lowerBoundIndex = arr.length;
        int l = 0;
        int r = arr.length - 1;
        while(l <= r){
            int m = (l + r) / 2;
            if(arr[m] < x){
                l = m + 1;
            }else{
                r = m - 1;
                lowerBoundIndex = m;
            }
        }
        return lowerBoundIndex;
    }
}
