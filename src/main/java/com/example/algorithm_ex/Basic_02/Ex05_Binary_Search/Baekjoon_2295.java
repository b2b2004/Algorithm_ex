package com.example.algorithm_ex.Basic_02.Ex05_Binary_Search;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_2295 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        int arrSum1[] = new int[(N * (N+1)) / 2];
        int index = 0;
        for(int i=0; i<N; i++){
            for(int j=i; j<N; j++){
                arrSum1[index++] = arr[i] + arr[j];
            }
        }
        Arrays.sort(arrSum1);

        int ans = -1;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                int target = arr[i] - arr[j];
                if(isExist(arrSum1, target)){
                    ans = Math.max(ans, arr[i]);
                }
            }
        }
        System.out.println(ans);

    }
    private static boolean isExist(int[] arrSum1, int target) {
        int l = 0;
        int r = arrSum1.length - 1;
        while(l <= r){
            int m = (l + r) / 2;
            if(arrSum1[m] < target){
                l = m + 1;
            }else if(arrSum1[m] > target){
                r = m - 1;
            }else {
                return true;
            }
        }
        return false;
    }
}
