package com.example.algorithm_ex.Basic_01.Ex08_Math;

import java.io.*;

public class Baekjoon_9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        while (true){
            if(n == -1){
                break;
            }

            sb.setLength(0);
            sb.append(n + " = 1");
            sum = 1;
            for(int i=2; i<n; i++) {
                if(n%i==0) {
                    sb.append(" + " + i);
                    sum += i;
                }
            }

            if(sum == n) {
                System.out.println(sb);
            } else {
                System.out.println(n + " is NOT perfect.");
            }
            n = Integer.parseInt(br.readLine());

        }
    }
}
