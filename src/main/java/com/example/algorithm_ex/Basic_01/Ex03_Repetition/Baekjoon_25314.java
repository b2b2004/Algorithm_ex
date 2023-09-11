package com.example.algorithm_ex.Basic_01.Ex03_Repetition;

import java.util.Scanner;

public class Baekjoon_25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt() / 4;

        for(int i =0; i<N;i++){
            System.out.print("long ");
        }
        System.out.print("int");
    }
}
