package com.example.algorithm_ex.Basic_01.Ex05_String;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon_1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s, " ");

        int n = st.countTokens();
        System.out.println(n);
    }
}
