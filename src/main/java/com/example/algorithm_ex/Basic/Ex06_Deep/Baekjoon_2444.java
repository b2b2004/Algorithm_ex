package com.example.algorithm_ex.Basic.Ex06_Deep;

import java.util.Scanner;

public class Baekjoon_2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;

        for(int i=1; i<=N; i++){
            for(int j=N-i; j>0; j--){
                System.out.print(" ");
            }
            for(int j=0; j<(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=N-1; i>0; i--){
            for(int j=i; j<N; j++){
                System.out.print(" ");
            }
            for(int j=0; j<(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


