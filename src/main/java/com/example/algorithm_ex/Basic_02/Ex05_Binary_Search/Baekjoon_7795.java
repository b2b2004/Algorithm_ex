package com.example.algorithm_ex.Basic_02.Ex05_Binary_Search;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_7795 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T > 0){
            int N = sc.nextInt();
            int M = sc.nextInt();
            int A[] = new int[N];
            int B[] = new int[M];
            int sum = 0;

            for(int i=0; i<N; i++){
                A[i] = sc.nextInt();
            }

            for(int i=0; i<M; i++){
                B[i] = sc.nextInt();
            }

            Arrays.sort(B);

            for(int i=0; i<N; i++){
                int l = 0;
                int r = M-1;
                int index = 0;

                while (l <= r){
                    int mid = (l + r) / 2;
                    if(B[mid] < A[i]){
                        l = mid + 1;
                        index = mid + 1;
                    }else{
                        r = mid - 1;
                    }
                }
                sum += index;
            }

            System.out.println(sum);
            T--;
        }
    }
}
