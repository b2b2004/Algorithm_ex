package com.example.algorithm_ex.Basic_01.Ex02_IF;

import java.util.Scanner;

public class Baekjoon_14681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x > 0 && y > 0){
            System.out.println(1);
        }else if(x < 0 && y > 0){
            System.out.println(2);
        }else if(x < 0 && y < 0){
            System.out.println(3);
        }else if(x > 0 && y < 0){
            System.out.println(4);
        }
    }
}
