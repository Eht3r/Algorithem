package Silver.Lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.stream.Stream;

public class boj_11399 { // ATM
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] people = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int result = 0;
        int temp = 0;
        Arrays.sort(people);

        for (int i = 0; i < N; i++) {
            temp += people[i];
            result += temp;
        }

        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}
