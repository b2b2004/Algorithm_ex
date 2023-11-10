package com.example.algorithm_ex.Basic_03.Ex05_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baekjoon_12851 {
    static int N;
    static int K;
    static int[] visited;
    static int[] count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        visited = new int[100001];
        count = new int[100001];

        Queue<Integer> q = new LinkedList<>();
        q.add(N);
        visited[N] = 1;
        count[N] = 1;

        while (!q.isEmpty()){
            int now = q.poll();
            if(now == K) break;

            int[] next = {now-1, now+1, now*2};
            for(int i=0; i<3; i++){
                if(!isRange(next[i])) continue;
                if(visited[next[i]] == 0){
                    visited[next[i]] = visited[now] + 1;
                    count[next[i]] = count[now];
                    q.add(next[i]);
                }else if(visited[next[i]] == visited[now] + 1){
                    count[next[i]] += count[now];
                }
            }
        }
        System.out.println(visited[K] - 1);
        System.out.println(count[K]);
    }

    static boolean isRange(int x){
        return x >= 0 && x <= 100000;
    }
}


