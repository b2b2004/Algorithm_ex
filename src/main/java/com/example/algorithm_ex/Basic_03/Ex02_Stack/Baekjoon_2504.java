package com.example.algorithm_ex.Basic_03.Ex02_Stack;

import java.util.Scanner;


class Element {
    enum Type {DELILIMER, SCORE}
    Type type;
    int value;

    public Element(Type type, int value) {
        this.type = type;
        this.value = value;
    }
}

public class Baekjoon_2504 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input = sc.next().toCharArray();
        Element stack[] = new Element[30];
        int topIndex = -1;

        for(char ch : input){
            int delimiterValue = delimiterTovalue(ch);
            if(ch == '(' || ch == '['){
                stack[++topIndex] = new Element(Element.Type.DELILIMER, delimiterValue);
            }else{
                int innerScore = 0;
                while(topIndex >= 0 && stack[topIndex].type == Element.Type.SCORE){
                    innerScore += stack[topIndex--].value;
                }

                if(topIndex < 0 || stack[topIndex].value != delimiterValue){
                    System.out.println(0);
                    return;
                }

                int score = innerScore * delimiterValue;
                if(score == 0)
                    score = delimiterValue;
                stack[topIndex] = new Element(Element.Type.SCORE, score);
            }
        }

        int ans = 0;
        while(topIndex >= 0) {
            if(stack[topIndex].type == Element.Type.DELILIMER){
                System.out.println(0);
                return;
            }
            ans += stack[topIndex--].value;
        }
        System.out.println(ans);

    }

    private static int delimiterTovalue(char delimiter) {
        if(delimiter == '(' || delimiter == ')')
            return 2;
        else if(delimiter == '[' || delimiter == ']')
            return 3;
        else
            return 0;
    }
}
