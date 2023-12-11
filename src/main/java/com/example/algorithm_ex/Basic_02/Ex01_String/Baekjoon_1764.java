package com.example.algorithm_ex.Basic_02.Ex01_String;

import java.util.*;

public class Baekjoon_1764 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSet<String> str = new HashSet<>();
        ArrayList<String> result = new ArrayList<>();
        int N = sc.nextInt();
        int M = sc.nextInt();

        for(int i=0; i<N; i++){
            str.add(sc.next());
        }
        int cnt = 0;
        for(int i=0; i<M; i++){
            String temp = sc.next();
            if(str.contains(temp)){
                result.add(temp);
                cnt++;
            }
        }
        Collections.sort(result);

        System.out.println(cnt);
        for(String str1 : result){
            System.out.println(str1);
        }
    }
}
