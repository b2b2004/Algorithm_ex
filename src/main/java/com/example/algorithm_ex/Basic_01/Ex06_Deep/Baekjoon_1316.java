package com.example.algorithm_ex.Basic_01.Ex06_Deep;

import java.util.Scanner;

public class Baekjoon_1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int count = N;
        for(int i=0; i<N; i++){
            String s = sc.next();
            int arr[] = new int[26];
            for(int j=0; j<s.length(); j++){
                if(arr[s.charAt(j) - 'a'] == 1){
                    if(s.charAt(j) == s.charAt(j-1)){
                        arr[s.charAt(j) - 'a'] = 1;
                    }else{
                        count--;
                        break;
                    }
                }else{
                    arr[s.charAt(j) - 'a'] = 1;
                }
            }
        }
        System.out.println(count);
    }
}
