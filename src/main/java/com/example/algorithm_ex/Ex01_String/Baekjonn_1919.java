package com.example.algorithm_ex.Ex01_String;

import java.util.Scanner;

/*
1919. 애너그램 만들기
 */

public class Baekjonn_1919 {

    public static int[] getCount(String str){
        int[] count = new int[26];
        for(int i = 0; i < str.length() ;i++){
            count[str.charAt(i) - 'a']++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();


        int[] countA = getCount(a);
        int[] countB = getCount(b);

        int ans = 0;
        for(int i =0; i < 26; i++){
            if(countA[i] > countB[i])
                ans += countA[i] - countB[i];
            else if(countB[i] > countA[i])
                ans += countB[i] - countA[i];
        }

        System.out.println(ans);
    }
}
