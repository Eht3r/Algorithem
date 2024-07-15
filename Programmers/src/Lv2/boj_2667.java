package Lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class boj_2667 { // 단지번호붙이기

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int count;

    private static void dfs(int[][] map, int x, int y) throws IOException {
        int n = map.length;

        if (x >= 0 && x < n && y >= 0 && y < n && map[x][y] == 1) {
            map[x][y] = 0;
            count++;
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                dfs(map, nx, ny);
            }
        }
    }

    private static void bfs(int[][] map, int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        int n = map.length;
        q.add(new int[]{x, y});
        map[x][y] = 0;

        while (!q.isEmpty()) {
            int[] poll = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = poll[0] + dx[i];
                int ny = poll[1] + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < n && map[nx][ny] == 1) {
                    map[nx][ny] = 0;
                    q.add(new int[]{nx, ny});
                    count++;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] map = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] inputs = br.readLine().split("");
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(inputs[j]);
            }
        }

        ArrayList<Integer> result1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1) {
                    dfs(map, i, j);
                    result1.add(count);
                    count = 0;
                }
            }
        }

        n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] inputs = br.readLine().split("");
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(inputs[j]);
            }
        }

        ArrayList<Integer> result2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1) {
                    bfs(map, i, j);
                    result2.add(count+1);
                    count = 0;
                }
            }
        }

        Collections.sort(result1);
        Collections.sort(result2);

        System.out.println("<DFS>");
        System.out.println(result1.size());
        for (Integer integer : result1) {
            System.out.println(integer);
        }
        System.out.println("<BFS>");
        System.out.println(result2.size());
        for (Integer integer : result2) {
            System.out.println(integer);
        }
    }
}
