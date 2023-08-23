package com.example.algorithm_ex.Basic.Ex08_Math;

import java.util.Scanner;

public class Baekjoon_1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = 1;
        int startpoint = 0;
        int T = 1;
        for(int i=2; N>a ;i++){
            startpoint = a;
            a += i;
            T++;
        }
        if(T % 2 == 0){
            System.out.println((N-startpoint) + "/"+ (T-(N-startpoint)+1));
        }else{
            System.out.println((T-(N-startpoint)+1) + "/"+ (N-startpoint));
        }
    }
}
