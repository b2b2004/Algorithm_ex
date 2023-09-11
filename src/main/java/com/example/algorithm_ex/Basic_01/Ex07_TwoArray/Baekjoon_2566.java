package com.example.algorithm_ex.Basic_01.Ex07_TwoArray;

import java.util.Scanner;

public class Baekjoon_2566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int index1 = 0;
        int index2 = 0;
        int max = -1;

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                int num = sc.nextInt();
                if(max < num){
                    max = num;
                    index1 = i+1;
                    index2 = j+1;
                }
            }
        }

        System.out.println(max);
        System.out.println(index1 + " " + index2);
    }
}
