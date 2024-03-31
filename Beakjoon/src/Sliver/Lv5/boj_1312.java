package Sliver.Lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj_1312 { // 소수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");

        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int N = Integer.parseInt(input[2]);

        bw.write(devide(A, B, N) + "\n");
        bw.flush();
        bw.close();
    }

    public static int devide(int A, int B, int N) {
        if (N == 0)
            return A / B;
        return devide((A % B * 10), B, --N);
    }
}
