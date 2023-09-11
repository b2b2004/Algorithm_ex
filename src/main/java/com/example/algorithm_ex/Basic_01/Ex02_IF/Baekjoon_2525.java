package com.example.algorithm_ex.Basic_01.Ex02_IF;

import java.util.Scanner;

public class Baekjoon_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // 시
        int B = sc.nextInt(); // 분
        int C = sc.nextInt(); // 걸리는 시간

        if(C >= 60){
            A = A + (C/60);
            B = B + (C%60);
        }else{
            B = B + C;
        }

        if(B >= 60){
            A++;
            B = B-60;
        }

        if(A >= 24){
            A = A-24;
        }

        System.out.println(A + " " + B);
    }
}
