package Lv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class boj_1766 { // 문제집

    private static List<Integer> TS(List<Integer>[] graph) {
        int n = graph.length;
        List<Integer> result = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] indegree = new int[n];

        for (List<Integer> integers : graph) {
            for (int w : integers) {
                indegree[w]++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                pq.add(i);
            }

            while (!pq.isEmpty()) {
                int v = pq.poll();
                result.add(v + 1);
                for (int w : graph[v]) {
                    indegree[w]--;
                    if (indegree[w] == 0) {
                        pq.add(w);
                    }
                }
            }
        }
        return result;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);
        List<Integer>[] graph = new List[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            inputs = br.readLine().split(" ");
            int a = Integer.parseInt(inputs[0]);
            int b = Integer.parseInt(inputs[1]);
            graph[a - 1].add(b - 1);
        }

        List<Integer> result = TS(graph);
        bw.write(result.toString());
        bw.flush();
        bw.close();
    }
}
