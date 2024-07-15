package Silver.Lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj_1789 { // 수들의 합
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long s = Long.parseLong(br.readLine());
        int result = (int) Math.floor((-1 + Math.sqrt(1 + 8 * s))/2);

        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}
