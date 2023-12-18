package com.example.algorithm_ex.Basic_02.Ex06_Two_Pointer;

import java.util.Scanner;

public class Baekjoon_17609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt(); // 이하
        int W = sc.nextInt(); // 이상
        char[] color = sc.next().toCharArray();

        int ans = 0;
        int countBlack = 0;
        int countWhite = 0;
        int nextIndex = 0;
        for(int i=0; i<N; i++){
            while (nextIndex < N){
                if(color[nextIndex] == 'B' && countBlack == B)
                    break;
                if (color[nextIndex++] == 'W')
                    countWhite++;
                else
                    countBlack++;
            }
            if(countWhite >= W)
                ans = Math.max(ans, nextIndex - i);
            if(color[i] == 'W')
                countWhite--;
            else
                countBlack--;
        }
        System.out.println(ans);

    }
}
