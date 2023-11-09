package com.example.algorithm_ex.Basic_03.Ex04_DFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baekjoon_2606 {

    static int N;
    static int M;
    static int[][] gragh;
    static boolean[] visited;
    static int cnt = 0;

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

        dfs(1);
        // bfs(1);
        System.out.println(cnt - 1);

    }

    static void dfs(int node){
        visited[node] = true;
        cnt++;
        for(int i=1; i<=N; i++){
            if(gragh[node][i] == 1  && !visited[i]){
                dfs(i);
            }
        }
    }

    static void bfs(int node){
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        visited[node] = true;
        while (!q.isEmpty()){
            int now = q.poll();
            cnt++;
            for(int i=1; i<=N; i++){
                if(gragh[now][i] == 1 && !visited[i]){
                    q.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
}
