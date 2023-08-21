package com.example.algorithm_ex.Basic.Ex02_IF;

import java.util.Scanner;

public class Baekjoon_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        if(M >= 45){
            System.out.println(H + " " + (M-45));
        }else {
            M = 60 - (45-M);
            if(H == 0){
                System.out.println(23 + " " + M);
            }else{
                System.out.println(H-1 + " " + M);
            }
        }
    }
}
