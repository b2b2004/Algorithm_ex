package com.example.algorithm_ex.Basic_02.Ex05_Binary_Search;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon_12015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        list.add(0);

        for(int i=0; i<N; i++){
            int num = sc.nextInt();
            if(list.get(list.size() - 1) < num){
                list.add(num);
            }else{
                int l = 0;
                int r = list.size() - 1;
                while (l < r){
                    int mid = (l + r) / 2;
                    if(list.get(mid) >= num){
                        r = mid;
                    }else{
                        l = mid + 1;
                    }
                }
                list.set(r, num);
            }
        }
        System.out.println(list.size() - 1);
    }

}
