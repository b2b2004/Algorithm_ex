package com.example.algorithm_ex.Basic_01.Ex02_IF;

import java.util.Scanner;

public class Baekjoon_1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if(A > B)
            System.out.println(">");
        else if (A < B)
            System.out.println("<");
        else if (A == B)
            System.out.println("==");

    }
}
