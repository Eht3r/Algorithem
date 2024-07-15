package Lv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class boj_2178 { // 미로탐색

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int count;

    private static void bfs(int[][] map, int x, int y) {
        int n = map.length;
        int m = map[0].length;
        int[][] d = new int[n][m];
        for (int i  = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                d[i][j] = -1;
            }
        }

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        d[x][y] = 1;
        map[x][y] = 0;


        while (!queue.isEmpty()) {
            int[] poll = queue.poll();

            if (poll[0] == n-1 && poll[1] == m - 1) {
                count = d[poll[0]][poll[1]];
                break;
            }

            for (int i = 0; i < 4; i++) {
                int nx = poll[0] + dx[i];
                int my = poll[1] + dy[i];

                if (nx >= 0 && nx < n && my >= 0 && my < m && map[nx][my] == 1) {
                    d[nx][my] = d[poll[0]][poll[1]] + 1;
                    map[nx][my] = 0;
                    queue.add(new int[]{nx, my});
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);

        int[][] map = new int[n][m];
        for (int i = 0; i < n; i++) {
            String[] input1s = br.readLine().split("");
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(input1s[j]);
            }
        }

        count = 1;
        bfs(map, 0, 0);
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}

