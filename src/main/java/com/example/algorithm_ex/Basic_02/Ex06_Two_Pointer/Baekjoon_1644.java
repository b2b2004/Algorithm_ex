package com.example.algorithm_ex.Basic_02.Ex06_Two_Pointer;

import java.util.ArrayList;
import java.util.Scanner;

public class Baekjoon_1644 {
    static int N;
    static boolean prime[];
    static ArrayList<Integer> prime_list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        prime = new boolean[N+1];
        isPrime();
        for(int i=2; i<=N; i++) {
            if(!prime[i]) {
                prime_list.add(i);
            }
        }

        int start=0, end=0, sum=0, count=0;
        while(true) {
            if(sum >= N)
                sum -= prime_list.get(start++);
            else if(end == prime_list.size())
                break;
            else
                sum += prime_list.get(end++);
            if(N==sum)
                count++;
        }
        System.out.println(count);
    }

    public static void isPrime() {
        for(int i=2; i<=N; i++) {
            for(int j=i*2; j<=N; j+=i) {
                prime[j] = true;
            }
        }
    }
}
