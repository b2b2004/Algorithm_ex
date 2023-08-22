package com.example.algorithm_ex.Basic.Ex05_String;

import java.util.Scanner;

public class Baekjoon_2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=0; i<N; i++){
            int M = sc.nextInt();
            String S = sc.next();

            for(int j=0; j<S.length(); j++){
                for(int z=0; z<M; z++){
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
        }

    }
}
