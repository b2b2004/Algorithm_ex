package com.example.algorithm_ex.Basic.Ex03_Repetition;

import java.util.Scanner;

public class Baekjoon_8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for(int i=0;i<=n;i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
