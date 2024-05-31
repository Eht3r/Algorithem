package Silver.Lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class boj_1181 { // 단어 정렬
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int minlength = 50;
        int mlindex = 0;
        String[] words = new String[N];

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            words[i] = input;
        }

        Arrays.sort(words, Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()));
        words = Arrays.stream(words).distinct().toArray(String[]::new);

        for (String word: words)
            bw.write(word + "\n");
        bw.flush();
        bw.close();
    }
}
