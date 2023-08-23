package com.example.algorithm_ex.Basic.Ex08_Math;

import java.util.Scanner;

public class Baekjoon_2292 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 1;
        int a = 2;
        for(int i=2; num >= a; i++){
            a += (i*6) - 6;
            sum++;
        }
        System.out.println(sum);
    }
}
