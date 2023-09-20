package com.example.algorithm_ex.Basic_03.Ex01_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baekjoon_15828 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();

        while(true){
            int M = sc.nextInt();
            if(M > 0){
                if(q.size() < N){
                    q.offer(M);
                }
            }else if(M == 0){
                q.poll();
            }else{
                break;
            }
        }

        if(q.size() == 0) System.out.println("empty");
        else{
            while(!q.isEmpty())
                System.out.print(q.poll() + " ");
        }
    }
}
