package Gold.Lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.stream.Stream;

public class boj_13975 { // 파일 합치기 3
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int t = 1; t <= T; t++) {
            PriorityQueue<Long> pq = new PriorityQueue<>();
            long result = 0;
            int N = Integer.parseInt(br.readLine());
            long[] file = Stream.of(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();

            for (int i = 0; i < N; i++) {
                pq.add(file[i]);
            }

            while (pq.size() != 1) {
                long temp = pq.poll() + pq.poll();
                pq.add(temp);
                result += temp;
            }

              bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }
}
