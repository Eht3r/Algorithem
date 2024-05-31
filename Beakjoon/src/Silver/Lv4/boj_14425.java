package Silver.Lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class boj_14425 { // 문자열 집합
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");
        final int N = Integer.parseInt(inputs[0]);
        final int M = Integer.parseInt(inputs[1]);
        Map<String, Integer> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < N; i++)
            map.put(br.readLine(), 0);

        for (int i = 0; i < M; i++)
            if (map.containsKey(br.readLine())) count++;

        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}
