package com.example.algorithm_ex.Basic.Ex08_Math;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_14215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n[] = {sc.nextInt(),sc.nextInt(),sc.nextInt()};
        Arrays.sort(n);

        if(n[0]+n[1] > n[2]){
            System.out.println(n[0]+n[1]+n[2]);
        }else{
            System.out.println((n[0]+n[1]) * 2 - 1);
        }
    }
}
