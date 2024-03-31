package Bronze.Lv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class boj_25305 { // 커트라인
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int K = Integer.parseInt(inputs[1]);
        Integer[] scores = Arrays.stream(Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray()).boxed().toArray(Integer[]::new);
        Arrays.sort(scores, Comparator.reverseOrder());

        bw.write(scores[K - 1] + "\n");
        bw.flush();
        bw.close();
    }
}
