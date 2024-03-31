package Bronze.Lv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class boj_10811 { // 바구니 뒤집기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < M; i++) {
            String[] input2 = br.readLine().split(" ");
            int start = Integer.parseInt(input2[0]);
            int end = Integer.parseInt(input2[1]);

            if (start == end) {
                continue;
            } else arr = reverse(arr, start, end);
        }

        for (int num: arr) {
            bw.write(num + " ");
        }
        bw.flush();
        bw.close();
    }

    public static int[] reverse (int[] arr, int start, int end) {
        int temp = 0;
        int repeat = (end - start) == 1 ? 1 : (end - start + 1) / 2;

        for (int i = 0; i < repeat; i++) {
            temp = arr[end - i - 1];
            arr[end - i - 1] = arr[start + i - 1];
            arr[start + i - 1] = temp;
        }

        return arr;
    }
}
