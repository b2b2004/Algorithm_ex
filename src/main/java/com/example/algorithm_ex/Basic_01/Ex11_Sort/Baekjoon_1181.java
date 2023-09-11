package com.example.algorithm_ex.Basic_01.Ex11_Sort;

import java.util.*;

public class Baekjoon_1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String s[] = new String[N];

        for(int i=0; i<N; i++){
            s[i] = sc.next();
        }

        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if(s1.length() == s2.length()){
                    return s1.compareTo(s2);
                }else{
                    return s1.length() - s2.length();
                }
            }
        });

        Object result[];

        result = Arrays.stream(s).distinct().toArray();

        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }

    }
}
