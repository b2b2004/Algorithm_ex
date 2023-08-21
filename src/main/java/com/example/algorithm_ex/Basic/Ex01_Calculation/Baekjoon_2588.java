package com.example.algorithm_ex.Basic.Ex01_Calculation;

import java.util.Scanner;

public class Baekjoon_2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println((b % 10) * a);
        System.out.println(((b % 100 - b % 10) * a) / 10);
        System.out.println(((b % 1000 - b % 100) * a) / 100);
        System.out.println(a*b);
    }
}
