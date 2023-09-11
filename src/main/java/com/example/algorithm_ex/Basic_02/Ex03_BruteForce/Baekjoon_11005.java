package com.example.algorithm_ex.Basic_02.Ex03_BruteForce;

import java.util.Scanner;

/*
11005. 진법 변환 2
 */
public class Baekjoon_11005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        String ans = "";
        while(a > 0){
            int d = a % b;
            if(d < 10) ans += d;
            else ans += (char)(d - 10 + 'A');
            a = a / b;
        }

        for(int i = ans.length() -1; i>= 0; i--)
            System.out.print(ans.charAt(i));
        System.out.println();
    }
}
