package Silver.Lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj_1531 { // 투명
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int M = Integer.parseInt(inputs[1]);
        int[][] picture = new int[101][101];

        for (int i = 0; i < N; i++) {
            String[] inputs1 = br.readLine().split(" ");
            int x1 = Integer.parseInt(inputs1[0]);
            int y1 = Integer.parseInt(inputs1[1]);
            int x2 = Integer.parseInt(inputs1[2]);
            int y2 = Integer.parseInt(inputs1[3]);

            for (int j = x1; j <= x2; j++) {
                for (int k = y1; k <= y2; k++) {
                    picture[j][k] += 1;
                }
            }
        }

        int count = 0;
        for (int[] ints : picture) {
            for (int anInt : ints) {
                if (anInt > M) {
                    count++;
                }
            }
        }

        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}
