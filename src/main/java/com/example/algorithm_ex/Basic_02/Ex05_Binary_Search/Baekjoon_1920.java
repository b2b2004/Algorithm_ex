package com.example.algorithm_ex.Basic_02.Ex05_Binary_Search;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int M = sc.nextInt();
        while(M-- > 0){
            int x = sc.nextInt();
            int ans = isExist(arr, x);
            System.out.println(ans);
        }
    }

    private static int isExist(int[] arr, int x) {
        int l = 0;
        int r = arr.length - 1;

        while(l <= r){
            int m = (l + r) / 2;
            if(arr[m] < x){
                l = m + 1;
            }else if(arr[m] > x){
                r = m - 1;
            }else{
                return 1;
            }
        }
        return 0;
    }


}
