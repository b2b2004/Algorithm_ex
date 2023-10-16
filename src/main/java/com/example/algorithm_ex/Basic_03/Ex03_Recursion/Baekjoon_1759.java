package com.example.algorithm_ex.Basic_03.Ex03_Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_1759 {
    static int L;
    static int C;
    static char[] input;
    static char[] password;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        L = sc.nextInt();
        C = sc.nextInt();

        input = new char[C];
        password = new char[L];

        for(int i=0; i<C; i++){
            input[i] = sc.next().charAt(0);
        }

        Arrays.sort(input);
        generate(0, 0, 0);
    }

    static void generate(int length, int index, int vowelCnt){
        if(length == L){
            if(vowelCnt >= 1 && L - vowelCnt >= 2){
                System.out.println(password);
            }
            return;
        }

        if(index < C){
            password[length] = input[index];
            int v = isVowel(input[index]) ? 1 : 0;
            generate(length + 1, index + 1, vowelCnt + v);

            password[length] = 0;
            generate(length, index + 1, vowelCnt);
        }
    }

    static boolean isVowel(char C){
        return C == 'a' || C == 'e' || C == 'i' || C == 'o' || C == 'u';
    }
}
