package Silver.Lv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.stream.Stream;

public class boj_18870 { // 좌표 압축
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] X  = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] sortedX = Arrays.stream(X.clone()).distinct().toArray();
        int index= 0;

        Arrays.sort(sortedX);

        for (int i = 0; i < N; i++) {
            index = Arrays.binarySearch(sortedX, X[i]);
            bw.write(index + " ");
        }

        bw.flush();
        bw.close();
    }
}
