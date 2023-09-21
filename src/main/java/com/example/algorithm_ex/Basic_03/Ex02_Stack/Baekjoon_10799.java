package com.example.algorithm_ex.Basic_03.Ex02_Stack;

import java.util.Scanner;

public class Baekjoon_10799 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] input = sc.next().toCharArray();
        int openCount = 0;
        int ans = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == '(') openCount++;
            else {
                openCount--;
                if (input[i - 1] == '(')
                    ans += openCount;
                else ans++;
            }
        }
        System.out.println(ans);
    }
}
