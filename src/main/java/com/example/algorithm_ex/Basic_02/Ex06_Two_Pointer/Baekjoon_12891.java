package com.example.algorithm_ex.Basic_02.Ex06_Two_Pointer;

import java.util.Scanner;

public class Baekjoon_12891 {

    private static int baseToIndex(char alp){
        if(alp == 'A') return 0;
        else if(alp == 'C') return 1;
        else if(alp == 'G') return 2;
        else if(alp == 'T') return 3;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int P = sc.nextInt();
        char arr[] = new char[S];
        int minimumCount[] = new int[4];

        String line = sc.next();
        for(int i=0; i<S; i++)
            arr[i] = line.charAt(i);

        for(int i=0; i<4; i++){
            minimumCount[i] = sc.nextInt();
        }

        int[] count = new int[4];
        for(int i=0; i<P-1; i++){
            count[baseToIndex(arr[i])]++;
        }

        int ans = 0;
        for(int i=P-1; i<S; i++){
            count[baseToIndex(arr[i])]++;
            if(isValid(count, minimumCount))
                ans++;

            count[baseToIndex(arr[i-P+1])]--;
        }

        System.out.println(ans);
    }

    private static boolean isValid(int[] count, int[] minimumCount) {
        for(int i=0; i<count.length; i++){
            if(count[i] < minimumCount[i])
                return false;
        }

        return true;
    }
}
