package com.example.algorithm_ex.Basic_02.Ex02_Array;

import java.util.Scanner;


/*
1236. 성지키기
 */
public class Baekjoon_1236 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 세로 크기
        int M = sc.nextInt(); // 가로 크기
        char[][] A = new char[N][M];

        for(int i=0; i<N; i++){
            A[i] = sc.next().toCharArray();
        }

        int existRow = 0;
        for(int i=0; i<N; i++){
            boolean exist = false;
            for(int j=0; j<M; j++)
                if(A[i][j] == 'X') {
                    exist = true;
                    break;
                }
            if(exist)
                existRow++;
        }

        int existCol = 0;
        for(int i=0; i<M; i++){
            boolean exist = false;
            for(int j=0; j<N; j++)
                if(A[j][i] == 'X') {
                    exist = true;
                    break;
                }
            if(exist)
                existCol++;
        }

        int needRow = N - existRow;
        int needCol = M - existCol;

        if(needRow > needCol){
            System.out.println(needRow);
        }else{
            System.out.println(needCol);
        }

    }
}
