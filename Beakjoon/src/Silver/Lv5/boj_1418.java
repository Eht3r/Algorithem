package Silver.Lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj_1418 { // k-세준수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 1; i <= n; i++) {
            int now = i;
            int max = 0;

            for (int j = 2; j <= Math.sqrt(now);) {
                if (now % j == 0) {
                    now /= j;
                    max = j;
                } else {
                    j++;
                }
            }

            if (now != 1) max = now;
            if (max <= k) count++;
        }

        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}
