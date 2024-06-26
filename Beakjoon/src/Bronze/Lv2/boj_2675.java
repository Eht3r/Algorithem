package Bronze.Lv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj_2675 { // 문자열 반복
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");
            int R = Integer.parseInt(input[0]);
            String S = input[1];

            for(String str: S.split("")) {
                for(int j = 0; j < R; j++) {
                    bw.write(str);
                }
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
}
