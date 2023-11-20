package com.example.algorithm_ex.Basic_03.Ex04_DFS;

import java.util.Scanner;

public class Baekjoon_9466 {
    static int[] nextNode;
    static int[] depth;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        for(int t=0; t<tc; t++){
            int n = sc.nextInt();
            nextNode = new int[n+1];
            depth = new int[n+1];

            for(int i=1; i<=n; i++){
                nextNode[i] = sc.nextInt();
                depth[i] = 0;
            }

            int cnt = 0;
            for(int i=1; i<=n; i++){
                if(depth[i] == 0){
                    depth[i] = 1;
                    cnt += dfs(i);
                }
            }
            System.out.println(n - cnt);
        }
    }

    static int dfs(int nodeNum){
        int next = nextNode[nodeNum];
        int cycleCnt = 0;

        if(depth[next] == 0){
            depth[next] = depth[nodeNum] + 1;
            cycleCnt = dfs(next);
        }else{
            cycleCnt = depth[nodeNum] - depth[next] + 1;
        }
        depth[nodeNum] = 100001;
        return cycleCnt < 0 ? 0 : cycleCnt;
    }
}
