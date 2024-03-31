package Lv1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

public class pro_135808 { // 과일 장수
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        Integer[] arr = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());
        int[] box = new int[m];

        for (int i = 0; i < arr.length / m; i++) {
            for (int j = 0; j < m; j++) {
                box[j] = arr[i * m + j];
            }
            Arrays.sort(box);

            answer += box[0] * m;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        pro_135808 sol = new pro_135808();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = 4;
        int m = 3;
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};

        bw.write(String.valueOf(sol.solution(k, m, score)));
        bw.flush();
        bw.close();
    }
}