package Lv1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class pro_140107 {
    public long solution(int k, int d) {
        long answer = 0;

        for (int a = 0; a <= d; a += k) {
            double b = Math.sqrt(Math.pow(d, 2) - Math.pow(a, 2));
            answer += (long) Math.floor(b/k) + 1;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        pro_140107 sol = new pro_140107();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = 2;
        int d = 4;

        bw.write(String.valueOf(sol.solution(k, d)));
        bw.flush();
        bw.close();
    }
}
