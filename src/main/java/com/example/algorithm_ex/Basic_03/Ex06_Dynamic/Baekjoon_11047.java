package com.example.algorithm_ex.Basic_03.Ex06_Dynamic;

import java.util.Scanner;

public class Baekjoon_11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int coin[] = new int[n];
        for (int i = 0; i < n; i++) {
            coin[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (k >= coin[i]) {
                count += k / coin[i];
                k %= coin[i];
            }
        }
        System.out.println(count);
    }
}
