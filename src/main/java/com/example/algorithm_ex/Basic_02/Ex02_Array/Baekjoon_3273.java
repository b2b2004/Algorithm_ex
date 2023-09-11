package com.example.algorithm_ex.Basic_02.Ex02_Array;


import java.util.Scanner;

/*
3273. 두 수의 합
 */
public class Baekjoon_3273 {
    public static void main(String[] args) {
        // 시간 복잡도 때문에 이중for문은 사용하지 못한다.

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int i=0; i<N; i++ ){
            a[i] = sc.nextInt();
        }
        int X = sc.nextInt();

        boolean[] exist = new boolean[10000001];
        for(int i=0; i<N; i++)
            exist[a[i]] = true;

        int ans = 0;
        for(int i=0; i<N; i++) {
            int pairValue = X - a[i];
            if(0 <= pairValue && pairValue <= 1000000)
                ans += exist[pairValue] ? 1 : 0;
        }
        System.out.println(ans / 2);
    }
}
