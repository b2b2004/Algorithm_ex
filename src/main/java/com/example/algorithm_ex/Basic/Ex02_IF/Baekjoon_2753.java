package com.example.algorithm_ex.Basic.Ex02_IF;

import java.util.Scanner;

public class Baekjoon_2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        if(y >= 1 && y <= 4000){
            if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0){
                System.out.println(1);
            }else {
                System.out.println(0);
            }
        }

    }
}
