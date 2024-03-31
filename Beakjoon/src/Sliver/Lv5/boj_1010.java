package Sliver.Lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class boj_1010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");

            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);
            BigInteger numerator = factorial(m);
            BigInteger denominator = factorial(n).multiply(factorial(m - n));
            BigInteger result = numerator.divide(denominator);


            bw.write(result + "\n");
        }

        bw.flush();
        bw.close();
    }

    public static BigInteger factorial(int n) {
        if (n == 0) {
            return BigInteger.ONE;
        }
        return new BigInteger(String.valueOf(n)).multiply(factorial(n - 1));
    }
}
