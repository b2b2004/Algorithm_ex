package com.example.algorithm_ex.Basic_01.Ex05_String;

import java.util.Scanner;

public class Baekjoon_9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=0; i<N; i++){
            String s = sc.next();
            System.out.print(s.charAt(0));
            System.out.print(s.charAt(s.length()-1) + "\n");
        }
    }
}
