package com.example.algorithm_ex.Basic_02.Ex01_String;

import java.util.Scanner;

public class Baekjoon_1541 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.next().split("-");
        int sum = Integer.MAX_VALUE;
        for(int i=0; i<str.length; i++){
            int temp = 0;
            String[] str1 = str[i].split("\\+");

            for(int j=0; j<str1.length; j++){
                temp += Integer.parseInt(str1[j]);
            }

            if(sum == Integer.MAX_VALUE){
                sum = temp;
            }else{
                sum -= temp;
            }
        }
        System.out.println(sum);
    }
}
