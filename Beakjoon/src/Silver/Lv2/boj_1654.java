package Silver.Lv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj_1654 { // 랜선 자르기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");
        int K = Integer.parseInt(inputs[0]);
        int N = Integer.parseInt(inputs[1]);
        int[] lan = new int[K];

        long min = 0;
        long max = 0;
        long mid = 0;


        for (int i = 0; i < K; i++) {
            lan[i] = Integer.parseInt(br.readLine());

            max = Math.max(max, lan[i]);
        }

        max++;

        while (min < max) {

            long count = 0;
            mid = (min + max) / 2;

            for (int num : lan) count += num / mid;

            if (count < N) max = mid;
            else min = mid + 1;
        }

        bw.write((min - 1)  + "\n");
        bw.flush();
        bw.close();
    }
}
