package Silver.Lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class boj_1384 { // 메시지
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int group = 1;

        while (N != 0) {
            boolean check = false;
            String[] name = new String[N];
            String[][] message = new String[N][N - 1];

            bw.write("Group " + group + "\n");
            for (int i = 0; i < N; i++) {
                String[] inputs = br.readLine().split(" ");

                name[i] = inputs[0];
                message[i] = Arrays.copyOfRange(inputs, 1, inputs.length);
            }

            for (int i = 0; i < N; i++) {
                int idx = i;
                for (int j = 0; j < N - 1; j++) {
                    idx--;

                    if (idx < 0) idx += N;

                    if (message[i][j].equals("N")) {
                        bw.write(name[idx] + " was nasty about " + name[i] + "\n");
                        check = true;
                    }
                }
            }

            if (!check) bw.write("Nobody was nasty\n");

            N = Integer.parseInt(br.readLine());
            bw.newLine();
            group++;
        }

        bw.close();
    }
}
