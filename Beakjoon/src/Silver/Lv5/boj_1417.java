package Silver.Lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.PriorityQueue;

public class boj_1417 { // 국회의원 선거
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int dasom = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        if (n == 1) {
            dasom = Integer.parseInt(br.readLine());
            bw.write("0");
        } else {
            int result = 0;
            for (int i = 0; i < n; i++) {
                if (i == 0)
                    dasom = Integer.parseInt(br.readLine());
                else {
                    pq.add(Integer.parseInt(br.readLine()));
                }
            }

            while (dasom <= pq.peek()) {
                int temp = pq.poll();
                pq.add(--temp);
                result++;
                dasom++;
            }

            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }
}
