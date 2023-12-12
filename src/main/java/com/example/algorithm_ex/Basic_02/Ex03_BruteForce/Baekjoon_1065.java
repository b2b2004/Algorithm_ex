package com.example.algorithm_ex.Basic_02.Ex03_BruteForce;

import java.util.Scanner;

public class Baekjoon_1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;

        for(int i=1; i<=N; i++){
            if(i < 100){
                cnt++;
            }else if(i <= 1000){
                if( ((i / 100) - ((i / 10) % 10)) ==  ((i / 10) % 10) - (i % 10)){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);

    }

}
