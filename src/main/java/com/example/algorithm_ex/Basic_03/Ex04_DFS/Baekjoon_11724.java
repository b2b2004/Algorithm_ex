package com.example.algorithm_ex.Basic_03.Ex04_DFS;

import java.util.Scanner;

public class Baekjoon_11724 {

    public static int N;
    public static int M;
    public static int cnt = 0;
    public static int[][] gragh;
    public static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        gragh = new int[N+1][N+1];
        visited = new boolean[N+1];

        for(int i=0; i<M; i++){
            int src = sc.nextInt();
            int dst = sc.nextInt();
            gragh[src][dst] = 1;
            gragh[dst][src] = 1;
        }

        for(int i=1; i<=N; i++){
            if(!visited[i]){
                dfs(i);
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    public static void dfs(int node){
        visited[node] = true;
        for(int i=1; i<=N; i++){
            if(gragh[node][i] == 1  && !visited[i]){
                dfs(i);
            }
        }
    }
}
