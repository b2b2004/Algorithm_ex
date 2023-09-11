package com.example.algorithm_ex.Basic_02.Ex01_String;

import java.util.Scanner;

public class Baekjoon_2744 {

     /*
     문제: 대소문자 바꾸기
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char[] ans = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            // 대/소문자 확인인
           if ('a' <= ans[i] && ans[i] <= 'z')
                ans[i] = (char)('A' + ans[i] - 'a');
            else ans[i] = (char)('a' + ans[i] - 'A');
        }

        System.out.println(ans);
    }
}
