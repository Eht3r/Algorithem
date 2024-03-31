package Sliver.Lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj_1193 { // 분수 찾기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int X = Integer.parseInt(br.readLine());
        int line = 0;
        int end = 0;

        while (end < X) {
            line++;
            end += line;
        }

        if (line % 2 == 0)
            bw.write((line - (end - X)) + "/" + (1  + (end -  X)));
        else
            bw.write((1 + (end - X)) + "/" + (line - (end - X)));

        bw.flush();
        bw.close();
    }
}
