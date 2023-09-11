package com.example.algorithm_ex.Basic_01.Ex05_String;

import java.util.Scanner;

public class Baekjoon_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int arr[] = new int[S.length()];
        int arr1[] = new int[26];

        for(int i=0; i<arr1.length; i++){
            arr1[i] = -1;
        }

        for(int i=0; i<S.length(); i++){
            arr[i] = S.charAt(i) - 97;
        }

        for(int i=0; i<S.length(); i++){
            if(arr1[arr[i]] == -1)
                arr1[arr[i]] = i;
        }

        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }


    }
}