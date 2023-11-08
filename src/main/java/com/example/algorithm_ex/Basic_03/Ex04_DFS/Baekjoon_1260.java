package com.example.algorithm_ex.Basic_03.Ex04_DFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baekjoon_1260 {

    public static int N;
    public static int M;
    public static int V;
    public static int[][] gragh;
    public static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        V = sc.nextInt();

        gragh = new int[N+1][N+1];
        visited = new boolean[N+1];

        for(int i=0; i<M; i++){
            int src = sc.nextInt();
            int dst = sc.nextInt();
            gragh[src][dst] = 1;
            gragh[dst][src] = 1;
        }
        dfs(V);
        System.out.println();
        visited = new boolean[N+1];
        bfs(V);
    }

    // DFS
    public static void dfs(int node){
        visited[node] = true;
        System.out.print(node + " ");
        for(int i=1; i<=N; i++){
            if(gragh[node][i] == 1 && !visited[i]){
                dfs(i);
            }
        }
    }

    // BFS
    public static Queue<Integer> q;
    public static void bfs(int node){
        q  = new LinkedList<>();
        q.add(node);
        visited[node] = true;

        while(!q.isEmpty()){
            int now = q.poll();
            System.out.print(now + " ");
            for(int i=0; i<=N; i++){
                if(gragh[now][i] == 1 && !visited[i]){
                    q.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
}
