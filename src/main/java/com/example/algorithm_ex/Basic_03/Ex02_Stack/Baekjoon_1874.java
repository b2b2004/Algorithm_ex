package com.example.algorithm_ex.Basic_03.Ex02_Stack;

import java.util.Scanner;

public class Baekjoon_1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i=0; i<N; i++)
            arr[i] = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        int stack[] = new int[N];
        int topIndex = -1;
        int nextNumber = 1;

        for(int x : arr){
            while(nextNumber <= x){
                stack[++topIndex] = nextNumber++;
                sb.append("+\n");
            }

            if(topIndex < 0 || stack[topIndex] != x){
                sb.setLength(0);
                sb.append("NO\n");
                break;
            }
            sb.append("-\n");
            --topIndex;
        }
        System.out.println(sb);
    }
}
