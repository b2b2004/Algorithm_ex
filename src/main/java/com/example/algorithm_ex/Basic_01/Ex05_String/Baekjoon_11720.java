package com.example.algorithm_ex.Basic_01.Ex05_String;

import java.util.Scanner;

public class Baekjoon_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = sc.next();
        int sum = 0;

        for(int i=0; i<N; i++){
            sum += s.charAt(i) - 48;
        }
        System.out.println(sum);
    }
}
