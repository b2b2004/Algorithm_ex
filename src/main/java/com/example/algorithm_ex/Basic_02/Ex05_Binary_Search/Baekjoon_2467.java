package com.example.algorithm_ex.Basic_02.Ex05_Binary_Search;

import java.util.Scanner;

public class Baekjoon_2467 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        int answer[] = new int[2];

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        long max = Long.MAX_VALUE;

        for (int i=0; i<N; i++) {
            int l = i+1;
            int r = N-1;
            while (l <= r) {
                int mid = (l + r) / 2;

                int sum = arr[i] + arr[mid];

                if (Math.abs(sum) < max) {
                    answer[0] = arr[i];
                    answer[1] = arr[mid];
                    max = Math.abs(sum);
                }

                if (sum < 0) {
                    l = mid + 1;
                }else{
                    r = mid - 1;
                }
            }
        }

        System.out.println(answer[0] + " " + answer[1]);
    }
}
