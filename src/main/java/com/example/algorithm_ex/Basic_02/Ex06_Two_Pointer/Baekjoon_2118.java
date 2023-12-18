package com.example.algorithm_ex.Basic_02.Ex06_Two_Pointer;

import java.util.Scanner;

public class Baekjoon_2118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] distance = new int[N];
        int distanceSum = 0;
        for(int i=0; i<N; i++){
            distance[i] = sc.nextInt();
            distanceSum += distance[i];
        }

        int pairIndex = 0;
        int distClockWise = 0; // 시계 방향
        int distCounterClockWise = distanceSum; // 반시계 방향
        int ans = 0;
        for(int i=0; i<N; i++){
            while (distClockWise < distCounterClockWise){
                distClockWise += distance[pairIndex];
                distCounterClockWise -= distance[pairIndex];
                pairIndex = (pairIndex + 1) % N;
            }
            ans = Math.max(ans, distCounterClockWise);
            distClockWise -= distance[i];
            distCounterClockWise += distance[i];
        }
        System.out.println(ans);
    }
}
