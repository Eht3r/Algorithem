package Sliver.Lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class boj_1251 { // 단어 나누기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int len = input.length();
        List<String> words = new ArrayList<>();

        for (int a = 1; a < len; a++) {
            for (int b = a + 1; b < len; b++) {
                words.add(reverse(input, a, b));
            }
        }

        Collections.sort(words);

        bw.write(words.get(0) + "\n");
        bw.flush();
    }

    public static String reverse(final String str, final int a, final int b) {
        String result = "";

        StringBuilder sb1 = new StringBuilder(str.substring(0, a));
        StringBuilder sb2 = new StringBuilder(str.substring(a, b));
        StringBuilder sb3 = new StringBuilder(str.substring(b));

        result = sb1.reverse().toString() + sb2.reverse().toString() + sb3.reverse().toString();

        return result;
    }
}