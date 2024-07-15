package Silver.Lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.stream.Stream;

public class boj_1427 { // 소트인사이드
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] input = Stream.of(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(input);

        for (int i = input.length - 1; i >= 0; i--) {
            bw.write(String.valueOf(input[i]));
        }
        bw.flush();
        bw.close();
    }
}
