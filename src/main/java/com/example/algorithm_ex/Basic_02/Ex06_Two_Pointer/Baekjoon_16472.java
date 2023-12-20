package com.example.algorithm_ex.Basic_02.Ex06_Two_Pointer;

import java.util.Scanner;

public class Baekjoon_16472 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[] arr = sc.next().toCharArray();
        int L = arr.length;

        int nextIndex = 0;
        int[] alphabet = new int[26];
        int ans = 0;

        for(int i=0; i<L; i++){
            while (nextIndex < L){
                alphabet[arr[nextIndex++] - 'a']++;
                if(getCount(alphabet) > N){
                    alphabet[arr[--nextIndex] - 'a']--;
                    break;
                }
            }
            ans = Math.max(ans, nextIndex - i);
            alphabet[arr[i] - 'a']--;
        }
        System.out.println(ans);
    }
    static int getCount(int[] alphabet){
        int count = 0;
        for(int i=0; i<alphabet.length; i++){
            if(alphabet[i] > 0) {
                count++;
            }
        }
        return count;
    }
}
