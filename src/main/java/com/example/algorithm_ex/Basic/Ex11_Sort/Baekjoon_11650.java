package com.example.algorithm_ex.Basic.Ex11_Sort;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_11650 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[][] = new int[N][2];

        for(int i=0; i<N; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        Arrays.sort(arr,(a,b)->{
            if(a[0] == b[0]){
                return a[1] - b[1];
            }else{
                return a[0] - b[0];
            }
        });

        for(int i=0; i<N; i++){
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }

}
