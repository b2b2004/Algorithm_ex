package com.example.datastructure.Sort;

public class RecursiveSum {
    public static int recursiveSum(int n){
        if(n <= 0) { // 기저 조건
            return 0;
        }else{
            return n + recursiveSum(n - 1); // 자기 자신을 호출하면서 n-1에 대한 합을 구함
        }
    }

    public static void main(String[] args) {
        int result = recursiveSum(5);
        System.out.println(result); // 출력 결과 15
    }
}
