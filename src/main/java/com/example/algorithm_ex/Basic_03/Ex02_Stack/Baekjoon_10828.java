package com.example.algorithm_ex.Basic_03.Ex02_Stack;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Baekjoon_10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> stack = new ArrayDeque<>();

        while(N-- > 0){
            String[] cmd = br.readLine().split(" ");
            if(cmd[0].equals("push")){
                stack.addLast(Integer.parseInt(cmd[1]));
            }else if(cmd[0].equals("pop")){
                bw.append(stack.isEmpty() ? "-1\n" : stack.removeLast() + "\n");
            }else if(cmd[0].equals("size")){
                bw.append(stack.size() + "\n");
            }else if(cmd[0].equals("empty")){
                bw.append(stack.isEmpty() ? "1\n" : "0\n");
            }else if(cmd[0].equals("top")){
                bw.append(stack.isEmpty() ? "-1\n" : stack.getLast() + "\n");
            }
        }

        bw.flush();
    }
}
