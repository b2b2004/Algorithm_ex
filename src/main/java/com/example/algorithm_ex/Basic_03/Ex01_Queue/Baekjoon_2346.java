package com.example.algorithm_ex.Basic_03.Ex01_Queue;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Baekjoon_2346 {

    static class Paper{
        int index;
        int paper;

        public Paper(int index, int paper) {
            this.index = index;
            this.paper = paper;
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = sc.nextInt();
        Deque<Paper> dq = new ArrayDeque<>();

        for(int i=1; i<=N; i++){
            dq.offer(new Paper(i, sc.nextInt()));
        }

        while(!dq.isEmpty()){
            bw.write(dq.getFirst().index + " ");
            int temp = dq.poll().paper;

            if(dq.isEmpty())
                break;

            if(temp > 0){
                for(int i=0; i<Math.abs(temp)-1; i++){
                    dq.addLast(dq.pollFirst());
                }
            }else{
                for(int i=0; i<Math.abs(temp); i++){
                    dq.addFirst(dq.pollLast());
                }
            }
        }
        bw.flush();
    }
}
