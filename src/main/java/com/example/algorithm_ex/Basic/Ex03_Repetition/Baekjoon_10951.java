package com.example.algorithm_ex.Basic.Ex03_Repetition;

import java.util.Scanner;

public class Baekjoon_10951 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A+B);
            if(sc.hasNext() == false){
                break;
            }
        }
    }
}
