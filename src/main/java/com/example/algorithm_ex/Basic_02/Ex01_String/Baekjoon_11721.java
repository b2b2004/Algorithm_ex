package com.example.algorithm_ex.Basic_02.Ex01_String;

import java.util.Scanner;

public class Baekjoon_11721 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.next();
        int cnt = 0;
        for(int i=0; i<msg.length(); i++) {
            System.out.print(msg.charAt(i));
            cnt++;
            if(cnt == 10){
                cnt = 0;
                System.out.println();
            }
        }
    }
}
