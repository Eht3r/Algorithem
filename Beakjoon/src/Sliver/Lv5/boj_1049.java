package Sliver.Lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj_1049 { // 막대기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());
        int[] sticks = {64, 32, 16, 8, 4, 2, 1};
        int count = 0;

        while (x != 0) {
            for (int i = 0; i < sticks.length; i++) {
                if (x >= sticks[i]) {
                    x -= sticks[i];
                    count++;
                    break;
                }
            }
        }

        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}
