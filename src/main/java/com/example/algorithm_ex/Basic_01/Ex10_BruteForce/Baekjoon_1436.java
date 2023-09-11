package com.example.algorithm_ex.Basic_01.Ex10_BruteForce;

import java.util.Scanner;

public class Baekjoon_1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num = 666;
        int sum = 1;
        while(N != sum){
            num++;
            if(String.valueOf(num).contains("666")){
                sum++;
            }
        }

        System.out.println(num);
    }
}