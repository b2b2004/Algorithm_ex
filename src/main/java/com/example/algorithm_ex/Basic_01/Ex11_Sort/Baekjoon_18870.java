package com.example.algorithm_ex.Basic_01.Ex11_Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Baekjoon_18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        int arr1[] = new int[N];
        HashMap<Integer, Integer> rankMap = new HashMap<Integer, Integer>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            arr1[i] = arr[i];
        }

        Arrays.sort(arr1);

        int rank = 0;

        for(int value : arr1){
            if(!rankMap.containsKey(value)){
                rankMap.put(value,rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int value : arr){
            sb.append(rankMap.get(value)).append(' ');
        }
        System.out.println(sb);
    }
}
