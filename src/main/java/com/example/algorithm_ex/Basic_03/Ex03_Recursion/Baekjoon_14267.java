package com.example.algorithm_ex.Basic_03.Ex03_Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon_14267 {
    public static int[] like;
    public static int[] parents;
    public static List<Integer>[] tree;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        parents = new int[n+1];
        like = new int[n+1];
        tree = new ArrayList[n+1];

        for(int i=1; i<=n; i++){
            tree[i] = new ArrayList<>();
            parents[i] = sc.nextInt();
            if(parents[i] == -1) continue;
            tree[parents[i]].add(i);
        }

        for(int i=0; i<m; i++){
            int employee = sc.nextInt();
            int point = sc.nextInt();
            like[employee] += point;
        }

        next(1);

        for(int i=1; i<=n; i++){
            System.out.print(like[i] + " ");
        }
    }

    public static void next(int node){
        for(int child : tree[node]){
            like[child] += like[node];
            next(child);
        }
    }
}
