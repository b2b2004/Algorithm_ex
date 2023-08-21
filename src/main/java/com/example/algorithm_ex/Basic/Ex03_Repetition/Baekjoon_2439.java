package com.example.algorithm_ex.Basic.Ex03_Repetition;

import java.util.Scanner;

public class Baekjoon_2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = "*";

        for(int i=0;i<N;i++){
            System.out.printf("%"+N+"s"+" \n", s);
            s += "*";
        }
    }
}
