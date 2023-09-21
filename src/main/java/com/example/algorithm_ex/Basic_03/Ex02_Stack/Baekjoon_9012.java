package com.example.algorithm_ex.Basic_03.Ex02_Stack;

import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class Baekjoon_9012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        while(N-- > 0){
            Stack<Character> stack = new Stack<>();
            String str = sc.next();

            for(int i=0; i<str.length(); i++){
                char c = str.charAt(i);
                if(c == '('){
                    stack.push(c);
                }else{
                    if(stack.size() > 0)
                        stack.pop();
                    else{
                        stack.push('N');
                        break;
                    }
                }
            }

            if(stack.isEmpty())
                System.out.println("YES");
            else
                System.out.println("NO");

        }
    }
}
