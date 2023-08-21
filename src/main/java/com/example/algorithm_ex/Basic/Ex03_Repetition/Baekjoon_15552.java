package com.example.algorithm_ex.Basic.Ex03_Repetition;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Baekjoon_15552 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for(int i=0;i<T;i++){
            String st = br.readLine();
            bw.write(Integer.parseInt(st.split(" ")[0]) + Integer.parseInt(st.split(" ")[1]) + "\n");
        }
        bw.flush();

    }
}
