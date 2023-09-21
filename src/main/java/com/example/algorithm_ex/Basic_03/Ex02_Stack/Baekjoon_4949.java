package com.example.algorithm_ex.Basic_03.Ex02_Stack;

import java.util.Scanner;

public class Baekjoon_4949 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            char[] line = sc.nextLine().toCharArray();
            if(line.length == 1 && line[0] == '.')
                break;

            char[] opened = new char[line.length];
            int topIndex = -1;
            boolean isValid = true;

            for(char ch : line){
                if(ch == '(' || ch == '['){
                    opened[++topIndex] = ch;
                }else if(ch == ')' || ch == ']'){
                    if(topIndex < 0 || !isMatch(opened[topIndex--], ch)){
                        isValid = false;
                        break;
                    }
                }
            }

            if(topIndex >= 0)
                isValid = false;
            System.out.println(isValid ? "yes" : "no");

        }
    }

    private static boolean isMatch(char open, char close) {
        if(open == '(' && close == ')')
            return true;

        if(open == '[' && close == ']')
            return true;

        return false;
    }
}

