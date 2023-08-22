package com.example.algorithm_ex.Basic.Ex06_Deep;

import java.util.Scanner;

public class Baekjoon_25206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Double grade = 0.0;
        Double sumgrade = 0.0;
        Double sumavg = 0.0;

        for(int i=0; i<20; i++){
            String title = sc.next();
            grade = sc.nextDouble();
            String score = sc.next();
            Double avg = 0.0;

            switch (score){
                case "A+":
                    avg = 4.5;
                    break;
                case "A0":
                    avg = 4.0;
                    break;
                case "B+":
                    avg = 3.5;
                    break;
                case "B0":
                    avg = 3.0;
                    break;
                case "C+":
                    avg = 2.5;
                    break;
                case "C0":
                    avg = 2.0;
                    break;
                case "D+":
                    avg = 1.5;
                    break;
                case "D0":
                    avg = 1.0;
                    break;
                case "F":
                    avg = 0.0;
                    break;
            }
            sumavg += avg * grade;

            if(!score.equals("P")){
                sumgrade += grade;
            }
        }

        System.out.printf("%.6f",sumavg / sumgrade);
    }
}