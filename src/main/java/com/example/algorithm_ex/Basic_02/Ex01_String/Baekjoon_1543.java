package com.example.algorithm_ex.Basic_02.Ex01_String;

import java.util.Scanner;

/*
1543. 문서 검색
 */

public class Baekjoon_1543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String word = sc.nextLine();

        int count = 0;
        int startIndex = 0;
        while(true){
            int findIndex = str.indexOf(word, startIndex); // word라는 인덱스를 startIndex부터 찾아줘
            if(findIndex < 0)
                break;
            count++;
            startIndex = findIndex + word.length();
        }

        System.out.println(count);


    }
}
