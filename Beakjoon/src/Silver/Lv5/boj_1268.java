package Silver.Lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.stream.Stream;

public class boj_1268 { // 임시 반장 정하기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] students = new int[n][5];
        for (int i = 0; i < n; i++) {
            students[i] = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        int leader = getLeader(n, students);

        bw.write((leader + 1) + "\n");
        bw.flush();
        bw.close();
    }

    private static int getLeader(int n, int[][] students) {
        int leader = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < n; k++) {
                    if (i != k && students[i][j] == students[k][j]) {
                        set.add(k);
                    }
                }
            }
            if (set.size() > max) {
                max = set.size();
                leader = i;
            }
        }
        return leader;
    }
}