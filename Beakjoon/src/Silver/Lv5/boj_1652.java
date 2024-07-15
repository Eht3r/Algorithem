package Silver.Lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj_1652 { // 누율 자리를 찾아라
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[][] room = new String[N][N];

        int horizontal = 0;
        int vertical = 0;

        for (int i = 0; i < N; i++) {
            room[i] = br.readLine().split("");
            int count = 0;
            for (int j = 0; j < N; j++) {
                if (!room[i][j].equals("X")) {
                    count++;
                } else {
                    if (count > 1) {
                        horizontal++;
                    }
                    count = 0;
                }
            }
            if (count > 1) horizontal++;
        }

        for (int i = 0; i < N; i++) {
            int count = 0;
            for (String[] strings : room) {
                if (!strings[i].equals("X")) {
                    count++;
                } else {
                    if (count > 1) {
                        vertical++;
                    }
                    count = 0;
                }
            }
            if (count > 1) vertical++;
        }

        bw.write(horizontal + " " + vertical);
        bw.flush();
        bw.close();
    }
}

