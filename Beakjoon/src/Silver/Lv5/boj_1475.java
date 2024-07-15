package Silver.Lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class boj_1475 { // 방 번호
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int[] digitcount = new int[10];

        for (char ch: input.toCharArray()) {
            digitcount[ch - '0']++;
        }

        int sixNineCount = (digitcount[6] + digitcount[9]);
        digitcount[6] = (sixNineCount + 1) / 2;
        digitcount[9] = 0;

        Arrays.sort(digitcount);
        bw.write(digitcount[9] + "\n");
        bw.flush();
        bw.close();
    }
}
