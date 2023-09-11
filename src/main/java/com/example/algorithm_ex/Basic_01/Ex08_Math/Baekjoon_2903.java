package com.example.algorithm_ex.Basic_01.Ex08_Math;

import java.util.Scanner;

public class Baekjoon_2903 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println((int)Math.pow(Math.pow(2, num) +1, 2));
    }
}
