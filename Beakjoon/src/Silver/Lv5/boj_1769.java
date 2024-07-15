package Silver.Lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj_1769 { // 3의 배수

    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int result = multiple(br.readLine());

        bw.write(count + "\n");
        if (result % 3 == 0) {
            bw.write("YES\n");
        } else {
            bw.write("NO\n");
        }
        bw.flush();
        bw.close();
    }

    private static int multiple(String str) {
        if (str.length() == 1) {
            return  Integer.parseInt(str);
        }

        count++;
        int sum = 0;
        for (int j = 0; j < str.length(); j++) {
            sum += str.charAt(j) - '0';
        }

        return multiple(String.valueOf(sum));
    }
}
