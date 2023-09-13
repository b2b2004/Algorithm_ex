package com.example.algorithm_ex.Basic_02.Ex05_Binary_Search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon_2417 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long n = Long.parseLong(br.readLine());
        System.out.println(calcIntegerSqrt(n));
    }

    private static long calcIntegerSqrt(Long x) {
        if(x == 0) return 0;

        long l = 1;
        long r = 1L << 32;
        long sqlt = -1;

        while(l <= r){
            long m = (l + r) / 2;
            if(isIntegerSqrt(x, m)){
                r = m - 1;
                sqlt = m;
            }else{
                l = m + 1;
            }
        }
        return sqlt;
    }

    private static boolean isIntegerSqrt(long N, long q) {
        return q * q >= N;
    }
}
