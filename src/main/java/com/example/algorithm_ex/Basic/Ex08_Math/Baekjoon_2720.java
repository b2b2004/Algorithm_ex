package com.example.algorithm_ex.Basic.Ex08_Math;

import java.util.Scanner;

public class Baekjoon_2720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=0; i<N; i++){
            int a = sc.nextInt();
            System.out.print(a / 25 + " ");
            a = a % 25;
            System.out.print(a / 10 + " ");
            a = a % 10;
            System.out.print(a / 5 + " ");
            a = a % 5;
            System.out.print(a / 1 + " ");
            System.out.println();
        }
    }
}
