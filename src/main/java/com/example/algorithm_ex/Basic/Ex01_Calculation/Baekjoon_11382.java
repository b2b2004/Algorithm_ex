package com.example.algorithm_ex.Basic.Ex01_Calculation;

import java.util.Scanner;

public class Baekjoon_11382 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sum = 0;
        for (int i = 0; i < 3;i++)
        {
        sum += sc.nextLong();
        }
        System.out.println(sum);
    }
}

