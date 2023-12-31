package com.example.algorithm_ex.Basic_02.Ex03_BruteForce;

import java.util.Scanner;

public class Baekjoon_9663 {

    public static int[] arr;
    public static int N;
    public static int count = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        arr = new int[N];

        dfs(0);
        System.out.println(count);
    }

    public static void dfs(int depth) {
        if (depth == N) {
            count++;
            return;
        }
        for (int i = 0; i < N; i++) {
            arr[depth] = i;

            if (Possibility(depth)) {
                dfs(depth + 1);
            }
        }
    }
    public static boolean Possibility(int depth) {
        for (int i = 0; i < depth; i++) {
            if (arr[depth] == arr[i]) {
                return false;
            }
            else if (Math.abs(depth - i) == Math.abs(arr[depth] - arr[i])) {
                return false;
            }
        }
        return true;
    }
}

