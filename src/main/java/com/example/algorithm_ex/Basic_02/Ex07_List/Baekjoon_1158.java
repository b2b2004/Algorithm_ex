package com.example.algorithm_ex.Basic_02.Ex07_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon_1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        for(int i=1; i<=N; i++){
            list.add(i);
        }

        int[] ans = new int[N];
        int currentIndex = 0;
        for(int i=0; i<N; i++){
            currentIndex = (currentIndex + K - 1) % list.size();
            ans[i] = list.remove(currentIndex);
        }

        System.out.print("<");
        for(int i=0; i<N; i++){
            if(i > 0)
                System.out.print(", ");
            System.out.print(ans[i]);
        }
        System.out.print(">");
    }
}
