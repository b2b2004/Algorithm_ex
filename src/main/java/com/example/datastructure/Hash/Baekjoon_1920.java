package com.example.datastructure.Hash;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
1920. 수 찾기
 */
public class Baekjoon_1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Set<Integer> A =  new HashSet<>();
        for(int i = 0; i < N; i++){
            int n = sc.nextInt();
            A.add(n);
        }

        int M = sc.nextInt();
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < M; i++){
            int m = sc.nextInt();

            if(A.contains(m)){
                result.append(1 + "\n");
            }else{
                result.append(0 + "\n");
            }
        }

        System.out.println(result);

    }
}
