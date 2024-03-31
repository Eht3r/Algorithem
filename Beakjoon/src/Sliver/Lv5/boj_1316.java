package Sliver.Lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj_1316 { // 그룹 단어 체커
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int count = 0;


        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            if (isGroupWord(input)) count++;
        }

        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }

    private static boolean isGroupWord(String input) {
        boolean[] check = new boolean[26];
        int prev = 0;
        int now = 0;

        for (int i = 1; i < input.length(); i++) {
            prev = input.charAt(i - 1);
            now = input.charAt(i);

            if (prev != input.charAt(i)) {
                boolean group = check[now - 'a'];
                if (group) return false;
                else check[prev - 'a'] = true;
            }
        }
        return true;
    }
}
