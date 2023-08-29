package com.example.algorithm_ex.Basic.Ex10_BruteForce;

import java.util.Scanner;

public class Baekjoon_19532 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // x
        int b = sc.nextInt(); // y
        int c = sc.nextInt(); // 값
        int d = sc.nextInt(); // x
        int e = sc.nextInt(); // y
        int f = sc.nextInt(); // 값

        for (int i = -999; i < 1000; i++) {
            for (int j = -999; j < 1000; j++) {
                if(a*i+b*j==c && d*i+e*j==f) {
                    System.out.println(i+" "+j);
                    return;
                }
            }
        }

    }
}
