package com.example.algorithm_ex.Basic_03.Ex04_DFS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon_1941 {
    static int[] students = new int[25];
    static boolean[] check = new boolean[25];
    static List<Integer> pick = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        for(int i=0; i<5; i++){
            String str = sc.next();
            for(int j=0; j<5; j++){
                if(str.charAt(j) == 'S'){
                    students[cnt] = 1; // 이다솜파
                }else{
                    students[cnt] = 0; // 임도연파
                }
                cnt++;
            }
        }

        int princess = nextCombination(0);
        System.out.println(princess);
    }

    static int nextCombination(int studentNum){
        // Base Case
        if(pick.size() == 7){
            int cnt = 0;

            for(int i=0; i<7; i++){
                if(students[pick.get(i)] == 1) cnt++;
            }
            if(cnt < 4) return 0;
            for(int i=0; i<7; i++){
                check[i] = false;
            }
            if(dfs(0) == 7) return 1;

            return 0;
        }

        if(studentNum >= 25) return 0;

        // Recursive case
        int ret = 0;
        ret += nextCombination(studentNum + 1);
        pick.add(studentNum);
        ret += nextCombination(studentNum + 1);
        pick.remove(pick.size() - 1);
        return ret;
    }

    static int dfs(int studentsNum){
        int count = 1;
        check[studentsNum] = true;
        int me = pick.get(studentsNum);
        for(int i=1; i<7; i++){
            int you = pick.get(i);
            if(!check[i] && isFriend(me, you)){
                count += dfs(i);
            }
        }

        return count;
    }

    public static boolean isFriend(int a, int b){
        int diff = Math.abs(a - b);
        int max = Math.max(a, b);
        if(diff == 1 && max % 5 != 0) return true;
        if(diff == 5) return true;
        return false;
    }
}
