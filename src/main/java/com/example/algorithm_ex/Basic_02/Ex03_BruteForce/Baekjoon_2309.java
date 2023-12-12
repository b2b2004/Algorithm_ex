package com.example.algorithm_ex.Basic_02.Ex03_BruteForce;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_2309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people[] = new int[9];
        int sum = 0;
        for(int i=0; i<9; i++){
            people[i] = sc.nextInt();
            sum += people[i];
        }

        for(int i=0; i<9; i++){
            for(int j=i+1; j<9; j++){
                if(sum - people[i] - people[j] == 100) {
                    people[i] = 101;
                    people[j] = 101;

                    Arrays.sort(people);
                    for(int pe : people){
                        if(pe != 101)
                            System.out.println(pe);
                    }
                    return;
                }
            }
        }
    }
}
