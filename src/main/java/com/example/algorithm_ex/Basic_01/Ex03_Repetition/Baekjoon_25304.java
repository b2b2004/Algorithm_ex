package com.example.algorithm_ex.Basic_01.Ex03_Repetition;

import java.util.Scanner;

public class Baekjoon_25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();

        int sum = 0;
        for(int i=0;i<N;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            sum += a*b;
        }

        if(X == sum)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}