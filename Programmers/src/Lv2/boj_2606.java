package Lv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


public class boj_2606 {

    private static void adfs(ArrayList<Integer>[] graph, int[] visited, int[] edgeTo, int v) {
        visited[v] = 1;
        edgeTo[v] = v;
        System.out.print(v + " ");

        for (int w : graph[v]) {
            if (visited[w] == 0) {
                adfs(graph, visited, edgeTo, w);
            }
        }

    }

    private static int dfs(ArrayList<Integer>[] graph, int s) {
        int[] visited = new int[graph.length];
        int[] edgeTo = new int[graph.length];
        int count = 0;

        adfs(graph, visited, edgeTo, s);
        System.out.print("\n" + "edgeTo: " + Arrays.toString(edgeTo));

        for (int num : visited) {
            if (num == 1) count++;
        }

        return count - 1;
    }

    private static int bfs(ArrayList<Integer>[] graph, int s) {
        int[] visited = new int[graph.length];
        int[] edgeTo = new int[graph.length];
        int count = 0;
        Queue<Integer> q = new LinkedList<>();

        visited[s] = 1;
        edgeTo[s] = s;
        q.add(s);
        System.out.print(s + " ");

        while (!q.isEmpty()) {
            int v = q.poll();

            for (int w : graph[v]) {
                if (visited[w] == 0) {
                    visited[w] = 1;
                    edgeTo[w] = v;
                    q.add(w);
                    System.out.print(w + " ");
                }
            }
        }

        for (int num : visited) {
            if (num == 1) count++;
        }
        System.out.println("\n" + "edgeTo: " + Arrays.toString(edgeTo));

        return count - 1;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int node = Integer.parseInt(br.readLine());
        int line = Integer.parseInt(br.readLine());
        ArrayList<Integer>[] graph = new ArrayList[node + 1];

        for (int i = 0; i < node + 1; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < line; i++) {
            String[] inputs = br.readLine().split(" ");

            int v1 = Integer.parseInt(inputs[0]);
            int v2 = Integer.parseInt(inputs[1]);

            graph[v1].add(v2);
            graph[v2].add(v1);
        }

       /* bw.write("<DFS>");
        int count = dfs(graph, 1);

        bw.write("<BFS>");
        count = bfs(graph, 1);

        bw.write(count + "\n");
        bw.flush();
        bw.close();*/

        System.out.println("<DFS>");
        int count = dfs(graph, 1);
        System.out.println();
        System.out.println(count);
        System.out.println();

        System.out.println("<BFS>");
        count = bfs(graph, 1);
        System.out.println(count);

    }


}