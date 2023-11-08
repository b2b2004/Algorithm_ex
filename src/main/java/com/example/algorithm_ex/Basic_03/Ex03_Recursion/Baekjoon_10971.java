package com.example.algorithm_ex.Basic_03.Ex03_Recursion;

import java.util.Scanner;

public class Baekjoon_10971 {
    public static int N;
    public static int[][] w;
    public static boolean[] visited;
    public static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        w = new int[N][N];
        visited = new boolean[N];

        for(int i = 0; i<N; i++){
            for(int j = 0; j<N; j++) {
                w[i][j] = sc.nextInt();
            }
        }

        travel(0, 0, 0, 0);
        System.out.println(answer);
    }

    static void travel(int start, int node, int sum, int cnt){
        // Base Case
        if(cnt == N && start == node){
            answer = Math.min(sum, answer);
            return;
        }

        // Recursive Case
        for(int i = 0; i<N; i++){
            if(!visited[i] && w[node][i] != 0){
                visited[i] = true;
                travel(start, i, sum + w[node][i], cnt + 1);
                visited[i] = false;
            }
        }
    }
}
