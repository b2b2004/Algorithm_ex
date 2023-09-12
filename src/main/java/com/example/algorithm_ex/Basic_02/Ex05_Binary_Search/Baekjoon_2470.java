package com.example.algorithm_ex.Basic_02.Ex05_Binary_Search;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_2470 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length-1;
        int sum = 0;
        int temp = 0;
        int max = Integer.MAX_VALUE;

        int ans1 = 0;
        int ans2 = 0;

        while(i < j){
            sum = arr[i] + arr[j];
            temp = Math.abs(sum);
            if(temp < max){
                max = temp;
                ans1 = arr[i];
                ans2 = arr[j];
            }

            if(sum > 0){
                j--;
            }else{
                i++;
            }

        }
        System.out.println(ans1 + " " + ans2);
    }
}
