package com.example.algorithm_ex.Basic_01.Ex08_Math;

import java.util.ArrayList;
import java.util.Scanner;

public class Baekjoon_2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int M = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;

        for(int i=M; i<=N; i++){
            int ck = 0;

            for(int j=1; j<=i; j++){
                if(i % j == 0)
                    ck++;
            }
            if(ck == 2){
                sum += i;
                list.add(i);
            }
        }

        if(sum == 0)
            System.out.println(-1);
        else{
            System.out.println(sum);
            System.out.println(list.get(0));
        }


    }
}
