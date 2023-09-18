package com.example.algorithm_ex.Basic_02.Ex07_List;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Baekjoon_1406 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Character> list = new LinkedList<>();
        String origin = sc.next();
        int M = sc.nextInt();
        for(int i=0; i<origin.length(); i++){
            list.add(origin.charAt(i));
        }

        ListIterator<Character> it = list.listIterator(list.size());
        while(M-- > 0){
            char cmd = sc.next().charAt(0);
            if(cmd == 'L'){
                if(it.hasPrevious())
                    it.previous();
            }else if(cmd == 'D'){
                if(it.hasNext())
                    it.next();
            }else if(cmd == 'B'){
                if(it.hasPrevious()){
                    it.previous();
                    it.remove();
                }
            }else if(cmd =='P'){
                it.add(sc.next().charAt(0));
            }
        }

        StringBuilder sb =new StringBuilder();
        for(char alp : list)
            sb.append(alp);
        System.out.println(sb);

    }
}
