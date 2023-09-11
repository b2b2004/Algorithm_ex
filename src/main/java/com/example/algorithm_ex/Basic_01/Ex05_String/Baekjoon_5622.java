package com.example.algorithm_ex.Basic_01.Ex05_String;

import java.util.Scanner;

public class Baekjoon_5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sum = 0;

        for(int i=0; i<s.length(); i++){
            int value = s.charAt(i);

            if(value < 68) sum += 3;
            else if(value < 71) sum += 4;
            else if(value < 74) sum += 5;
            else if(value < 77) sum += 6;
            else if(value < 80) sum += 7;
            else if(value < 84) sum += 8;
            else if(value < 87) sum += 9;
            else sum += 10;
        }

        System.out.println(sum);
    }
}
