package Bronze.Lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.stream.Stream;

public class boj_28417 { // 스케이트보드
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] result = new int[N];

        for (int i = 0; i < N; i++) {
            String[] inputs = br.readLine().split(" ");

            result[i] += Math.max(Integer.parseInt(inputs[0]), Integer.parseInt(inputs[1]));

            int[] arr = Stream.of(Arrays.copyOfRange(inputs, 2, inputs.length)).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(arr);
            result[i] += arr[arr.length - 1];
            result[i] += arr[arr.length - 2];
        }

        Arrays.sort(result);

        bw.write(result[N-1] + "\n");
        bw.flush();
        bw.close();
    }
}
