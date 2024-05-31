package Gold.Lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class boj_1402 { //가장 긴 증가하는 부분 수열 4
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] dp = new int[n];
        int[] prevIndex = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int maxLength = 1;
        int maxIndex = 0;
        dp[0] = 1;
        prevIndex[0] = -1;

        for (int i = 1; i < n; i++) {
            dp[i] = 1;
            prevIndex[i] = -1;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                    prevIndex[i] = j;
                }
            }
            if (dp[i] > maxLength) {
                maxLength = dp[i];
                maxIndex = i;
            }
        }

        bw.write(String.valueOf(maxLength) + "\n");

        // LIS에 포함되는 원소들을 역추적하여 실제 LIS를 구함
        int[] lis = new int[maxLength];
        int currentIndex = maxIndex;
        for (int i = maxLength - 1; i >= 0; i--) {
            lis[i] = arr[currentIndex];
            currentIndex = prevIndex[currentIndex];
        }

        for (int i = 0; i < maxLength; i++) {
            bw.write(String.valueOf(lis[i]) + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
