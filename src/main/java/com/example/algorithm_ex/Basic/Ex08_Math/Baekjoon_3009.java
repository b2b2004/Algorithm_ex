package com.example.algorithm_ex.Basic.Ex08_Math;

import java.util.ArrayList;
import java.util.Scanner;

public class Baekjoon_3009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();

        for(int i=0;i<3;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (x.contains(a)) {
                x.remove(x.indexOf(a));
            }else{
                x.add(a);
            }
            if (y.contains(b)) {
                y.remove(y.indexOf(b));
            }else{
                y.add(b);
            }
        }

        System.out.println(x.get(0) + " " + y.get(0));

    }
}
