package Silver.Lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj_1543 { // 문서 검색
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String search = br.readLine();

        int size = str.length();
        int size1 = search.length();

        str = str.replace(search, "");

        bw.write((size - str.length()) / size1 + "\n");
        bw.flush();
        bw.close();
    }
}
