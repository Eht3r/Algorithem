package Bronze.Lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.stream.Stream;

public class boj_31281_10817 { // ЗЛАТНАТА СРЕДА, 세 수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long[] inputs = Stream.of(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();

        Arrays.sort(inputs);

        bw.write(inputs[1] + "\n");
        bw.flush();
        bw.close();
    }
}
