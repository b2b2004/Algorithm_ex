package com.example.algorithm_ex.Basic_03.Ex01_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baekjoon_1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();

        for(int i=1; i<=N; i++)
            q.add(i);

        int ans[] = new int[N];
        for(int i=0; i<N; i++){
            for(int j=1; j<K; j++)
                q.add(q.poll());
            ans[i] = q.poll();
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
