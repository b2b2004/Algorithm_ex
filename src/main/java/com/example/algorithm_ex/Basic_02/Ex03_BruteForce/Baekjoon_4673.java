package com.example.algorithm_ex.Basic_02.Ex03_BruteForce;

public class Baekjoon_4673 {
    public static void main(String[] args) {

        boolean num[] = new boolean[10001];
        for(int i=1; i<10000; i++){
            int temp = d(i);
            num[temp] = true;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10000; i++) {
            if (!num[i]) sb.append(i + "\n");
        }
        System.out.print(sb);

    }
    static int d(int temp){
        int sum = temp;
        while (temp != 0){
            sum += temp % 10;
            temp /= 10;
        }
        if (sum <= 10000) return sum;
        return 0;
    }
}
