package com.example.algorithm_ex.Basic_01.Ex08_Math;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_5073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[3];
        while(true){
            for(int i=0; i<3; i++)
            {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);

            if(a[0] == 0 && a[1] == 0 && a[2] == 0)
                break;

            if(a[2] >= a[0] + a[1]) {
                System.out.println("Invalid");
            }else if(a[0] == a[1] && a[1] == a[2]) {
                System.out.println("Equilateral");
            }else if(a[0] == a[1] || a[1] == a[2] || a[0] == a[2]) {
                System.out.println("Isosceles");
            }else {
                System.out.println("Scalene");
            }


        }

    }
}
