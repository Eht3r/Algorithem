package Gold.Lv5;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.PriorityQueue;

public class boj_1374 { // 강의실
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][3];

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");

            arr[i][0] = Integer.parseInt(input[0]);
            arr[i][1] = Integer.parseInt(input[1]);
            arr[i][2] = Integer.parseInt(input[2]);
        }

        Arrays.sort(arr, (o1, o2) -> {
            if (o1[1] == o2[1]) return o1[2] - o2[2];
            return o1[1] - o2[1];
        });

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            if(pq.isEmpty()) {
                pq.add(arr[i][2]);
            } else {
                int end_time = pq.peek();
                if(arr[i][1] < end_time) {
                    pq.add(arr[i][2]);
                } else {
                    pq.poll();
                    pq.add(arr[i][2]);
                }
            }
        }

        bw.write(pq.size() + "\n");
        bw.flush();
        bw.close();
    }
}
