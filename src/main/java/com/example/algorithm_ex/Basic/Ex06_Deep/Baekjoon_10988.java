package com.example.algorithm_ex.Basic.Ex06_Deep;

import java.util.Scanner;

public class Baekjoon_10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int result = 1;
        for(int i=0; i < (s.length()/2); i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)){
                result = 0;
            }
        }

        System.out.println(result);
    }
}
