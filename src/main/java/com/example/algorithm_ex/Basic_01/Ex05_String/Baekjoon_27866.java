package com.example.algorithm_ex.Basic_01.Ex05_String;

import java.util.Scanner;

public class Baekjoon_27866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        int i = sc.nextInt();
        char[] arr = S.toCharArray();

        System.out.println(arr[i-1]);
    }
}
