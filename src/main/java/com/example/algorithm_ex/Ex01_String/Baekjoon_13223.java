package com.example.algorithm_ex.Ex01_String;

/*
13223. 소금 폭탄
 */

import java.util.Scanner;

public class Baekjoon_13223 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.next();
        String salt = sc.next();

        String[] time1 = time.split(":");
        String[] salt1 = salt.split(":");

        int hour = Integer.parseInt(time1[0]);
        int minute = Integer.parseInt(time1[1]);
        int second = Integer.parseInt(time1[2]);
        int secondAmount = hour * 3600 + minute * 60 + second;

        int saltHour = Integer.parseInt(salt1[0]);
        int saltMinute = Integer.parseInt(salt1[1]);
        int saltSecond = Integer.parseInt(salt1[2]);
        int saltSecondAmount = saltHour * 3600 + saltMinute * 60 + saltSecond;

        int needSecondAmount = saltSecondAmount - secondAmount;
        if(needSecondAmount <= 0)
            needSecondAmount += 24 * 3600;

        int needHour = needSecondAmount / 3600;
        int needMinute = (needSecondAmount % 3600) / 60;
        int needSecond = needSecondAmount % 60;

        System.out.printf("%02d:%02d:%02d", needHour, needMinute, needSecond);
    }
}
