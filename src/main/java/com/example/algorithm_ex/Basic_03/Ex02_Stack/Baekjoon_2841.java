package com.example.algorithm_ex.Basic_03.Ex02_Stack;

import java.util.Scanner;
import java.util.Stack;

public class Baekjoon_2841 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = sc.nextInt();

        Stack<Integer>[] pushed = new Stack[7];

        for(int i=1; i<=6; i++){
            pushed[i] = new Stack<>();
         }

        int moveCount = 0;
        for(int i=0; i<N; i++){
            int num = sc.nextInt();
            int fret = sc.nextInt();

            while (!pushed[num].isEmpty()){
                if(pushed[num].peek() > fret){
                    moveCount++;
                    pushed[num].pop();
                }else{
                    break;
                }
            }

            if(!pushed[num].isEmpty() && pushed[num].peek() == fret)
                continue;
            pushed[num].push(fret);
            moveCount++;
        }

        System.out.println(moveCount);
    }
}
