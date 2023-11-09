package com.example.algorithm_ex.Basic_03.Ex04_DFS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon_2573 {
    static int N;
    static int M;
    static int[][] earth;
    static boolean[][] visited;
    static int[] dr =  {-1, 1, 0, 0};
    static int[] dc =  {0, 0, -1, 1};
    static List<Ice> iceList;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        earth = new int[N][M];
        visited = new boolean[N][M];
        iceList = new ArrayList<>();

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                earth[i][j] = sc.nextInt();
                if(earth[i][j] > 0){
                    iceList.add(new Ice(i, j, earth[i][j]));
                }
                visited[i][j] = true;
            }
        }

        // 빙하 녹는 시간
        for(int year=1; !iceList.isEmpty(); year++){
            for(Ice ice : iceList){
                for(int j=0; j<4; j++){
                    int nr = ice.row + dr[j];
                    int nc = ice.col + dc[j];

                    if(earth[nr][nc] == 0){
                        ice.height--;
                    }

                }
            }

            // 녹은 빙산 갱신
            for(int i=0; i<iceList.size(); i++){
                Ice ice = iceList.get(i);
                if(ice.height <= 0){
                    earth[ice.row][ice.col] = 0;
                    iceList.set(i, iceList.get(iceList.size() - 1));
                    iceList.remove(iceList.size() - 1);
                    i--;
                }else{
                    // 빙산이 남아 있다면 연결되어 있는지 확인
                    visited[ice.row][ice.col] = false;
                }
            }

            if(iceList.size() > 0 && dfs(iceList.get(0).row, iceList.get(0).col) != iceList.size()){
                System.out.println(year);
                System.exit(0);
            }
        }
        System.out.println(0);

    }
    static int dfs(int r, int c){
        visited[r][c] = true;
        int cnt = 1;
        for(int i=0; i<4; i++){
            int nr = r + dr[i];
            int nc = c + dc[i];
            if(visited[nr][nc]) continue;
            cnt += dfs(nr, nc);
        }
        return cnt;
    }
}
class Ice{
    int row;
    int col;
    int height;

    public Ice(int r, int c, int h){
        this.row = r;
        this.col = c;
        this.height = h;
    }
}