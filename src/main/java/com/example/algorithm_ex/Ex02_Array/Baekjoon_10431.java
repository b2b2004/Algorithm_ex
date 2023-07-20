package com.example.algorithm_ex.Ex02_Array;

import java.util.Scanner;

/*
10431. 줄 세우기
 */

public class Baekjoon_10431 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        while(a-- > 0)
        {
            int T = sc.nextInt();
            int[] h = new int[20];
            for(int i=0; i<20;i++)
                h[i] = sc.nextInt();

            // 계산 시작
            int count = 0;
            int[] sorted = new int[20];
            for(int i=0; i<20; i++){
                // 1. 줄 서있는 학생 중 자신보다 큰 학생을 찾는다.
                boolean find = false;
                for(int j=0; j<i; j++)
                    if(sorted[j] > h[i]){
                        // 2. 찾았다면, 그 학생 앞에 선다.
                        // 3. 그 학생과 그 뒤의 학생이 모두 한칸씩 물러난다.
                        find = true;
                        for(int k=i-1; k>=j; k--) {
                            sorted[k+1] = sorted[k];
                            count++;
                        }
                        sorted[j] = h[i];
                        break;
                    }
                if(!find)
                    sorted[i] = h[i];
            }
            System.out.println(T + " " + count);

        }
    }
}
