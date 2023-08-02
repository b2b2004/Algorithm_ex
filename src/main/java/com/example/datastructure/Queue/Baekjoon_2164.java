package com.example.datastructure.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baekjoon_2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < num; i++) // if 4
            queue.add(i + 1); // 1, 2, 3, 4

        int count = 1;
        while(queue.size() != 1){
            int q = queue.poll();
            if(count % 2 == 0){
                queue.offer(q);
            }
            count++;
        }

        System.out.println(queue.peek());
    }
}
