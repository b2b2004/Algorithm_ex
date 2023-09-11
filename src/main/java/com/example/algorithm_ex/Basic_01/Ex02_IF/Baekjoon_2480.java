package com.example.algorithm_ex.Basic_01.Ex02_IF;

import java.util.Scanner;

public class Baekjoon_2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = 0;
        if(a == b && b == c) {
            System.out.println(10000 + a * 1000);
        }else if(a != b && b != c && a != c){
            if(a > b){
                if(a > c){
                    max = a;
                }else{
                    max = c;
                }
            }else if(b > a){
                if(b > c){
                    max = b;
                }else{
                    max = c;
                }
            }
            System.out.println(max * 100);
        }else{
            if(a == b || a == c){
                System.out.println(1000 + a*100);
            }else{
                System.out.println(1000 + b*100);
            }
        }

    }
}
