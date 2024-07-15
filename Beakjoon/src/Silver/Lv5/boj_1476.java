package Silver.Lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj_1476 { // 날짜 계산
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");
        int e = Integer.parseInt(inputs[0]);
        int s = Integer.parseInt(inputs[1]);
        int m = Integer.parseInt(inputs[2]);

        int E = 0;
        int S = 0;
        int M = 0;
        int year = 0;

        do {
            year++;
            E++;
            S++;
            M++;
            if (E == 16) E = 1;
            if (S == 29) S = 1;
            if (M == 20) M = 1;
        } while (e != E || s != S || m != M);

        bw.write(year + "\n");
        bw.flush();
        bw.close();
    }
}
