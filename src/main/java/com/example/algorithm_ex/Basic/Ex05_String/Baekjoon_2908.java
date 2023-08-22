package com.example.algorithm_ex.Basic.Ex05_String;

import java.util.Scanner;

public class Baekjoon_2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
        B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());

        if(A > B)
            System.out.println(A);
        else
            System.out.println(B);

    }
}
