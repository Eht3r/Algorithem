package Bronze.Lv4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_30281 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] candies = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            candies[i] = Integer.parseInt(st.nextToken());
        }

        int answer = 0;
        for (int mask = 0; mask < (1 << N); mask++) {
            int sum = 0;
            for (int i = 0; i < N; i++) {
                if ((mask & (1 << i)) != 0) {
                    sum += candies[i];
                }
            }
            if (sum % 2 == 0) {
                answer = Math.max(answer, sum / 2);
            }
        }

        System.out.println(answer);
    }
}
