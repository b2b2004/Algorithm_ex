package com.example.algorithm_ex.Basic.Ex10_BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon_1018 {

    public static boolean[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        arr = new boolean[N][M];

        for(int i=0; i<N; i++){
            String a = br.readLine();
            for(int j=0; j<M; j++){
                if(a.charAt(j) == 'W')
                    arr[i][j] = true;
                else
                    arr[i][j] = false;
            }
        }

        int min = 1000;
        for(int i=0; i<N-7; i++){
            for(int j=0; j<M-7; j++){
                min = Math.min(min, solved(i,j));
            }
        }

        System.out.println(min);

    }

    public static int solved(int a, int b) {
        int sum = 0;

        boolean ck = arr[a][b];

            for(int i=a; i<a+8; i++){
                for(int j=b; j<b+8; j++){
                    if(arr[i][j] != ck){
                        sum++;
                    }
                    ck = !ck;
                }
                ck = !ck;
            }

            sum = Math.min(sum, 64 - sum);

        return sum;
    }


}
