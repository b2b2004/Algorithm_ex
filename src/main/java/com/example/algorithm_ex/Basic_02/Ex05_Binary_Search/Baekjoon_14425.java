package com.example.algorithm_ex.Basic_02.Ex05_Binary_Search;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_14425 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        String arr[] = new String[N];

        for(int i=0; i<N; i++){
            arr[i] = sc.next();
        }
        Arrays.sort(arr);

        int sum = 0;
        while (M-- > 0){
            String x = sc.next();
            sum += isExist(arr, x);
        }
        System.out.println(sum);

    }

    private static int isExist(String[] arr, String x) {
        int l = 0;
        int r = arr.length - 1;
        while(l <= r){
            int m = (l + r) / 2;
            int compareResult = arr[m].compareTo(x); // 작으면 음수 같으면 0 크면 양수
            if(compareResult < 0){
                l = m + 1;
            }else if(compareResult > 0){
                r = m - 1;
            }else{
                return 1;
            }
        }

        return 0;
    }
}
