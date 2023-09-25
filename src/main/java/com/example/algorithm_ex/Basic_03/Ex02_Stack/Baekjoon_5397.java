package com.example.algorithm_ex.Basic_03.Ex02_Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Baekjoon_5397 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        while(N-- > 0){
            char[] input = sc.next().toCharArray();
            Deque<Character> beforeCursor = new ArrayDeque<>();
            Deque<Character> afterCursor = new ArrayDeque<>();

            for (char cmd : input) {
                if (cmd == '-') {
                    beforeCursor.pollLast();
                }
                else if (cmd == '<') {
                    if (!beforeCursor.isEmpty())
                        afterCursor.offerLast(beforeCursor.pollLast());
                }
                else if (cmd == '>') {
                    if (!afterCursor.isEmpty())
                        beforeCursor.offerLast(afterCursor.pollLast());
                }
                else {
                    beforeCursor.offerLast(cmd);
                }
            }

            StringBuilder sb = new StringBuilder();
            while (!beforeCursor.isEmpty()) sb.append(beforeCursor.pollFirst());
            while (!afterCursor.isEmpty()) sb.append(afterCursor.pollLast());
            System.out.println(sb);

            }
        }
}
