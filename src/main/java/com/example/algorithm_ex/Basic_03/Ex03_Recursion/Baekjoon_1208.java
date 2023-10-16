package com.example.algorithm_ex.Basic_03.Ex03_Recursion;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Baekjoon_1208 {
    static int S;
    static int[] numbers;
    static long answer = 0;
    public static int status = -1;
    static final int LEFT = 0;
    static final int RIGHT = 1;
    static Map<Integer, Integer> cnt = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        S = sc.nextInt();
        numbers = new int[N];

        for(int i=0; i<N; i++){
            numbers[i] = sc.nextInt();
        }

        status = LEFT;
        solve(0, N/2, 0);

        status = RIGHT;
        solve(N/2, N, 0);

        if(S == 0) answer--;
        System.out.println(answer);
    }

    public static void solve(int index, int end, int sum){
        if(index == end){
            if(status == LEFT){
                int prev = cnt.getOrDefault(sum, 0);
                cnt.put(sum, prev+1);
            }else if(status == RIGHT){
                answer += cnt.getOrDefault(S - sum, 0);
            }
            return;
        }
        solve(index+1, end, sum);
        solve(index+1, end, sum+numbers[index]);
    }
}
