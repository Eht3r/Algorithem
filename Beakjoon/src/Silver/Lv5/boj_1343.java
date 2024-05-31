package Silver.Lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj_1343 { // 폴리오미노
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder input = new StringBuilder(br.readLine());
        for (int i = 0; i < input.length();) {
            if (input.charAt(i) == 'X') {
                if (i + 3 < input.length() && input.substring(i, i + 4).equals("XXXX")) {
                    input.replace(i, i + 4, "AAAA");
                    i += 4;
                } else if (i + 1 < input.length() && input.substring(i, i + 2).equals("XX")) {
                    input.replace(i, i + 2, "BB");
                    i+=2;
                } else {
                    input = new StringBuilder("-1");
                    break;
                }
            } else {
                i++;
            }
        }

        bw.write(input.toString());
        bw.flush();
        bw.close();
    }
}
