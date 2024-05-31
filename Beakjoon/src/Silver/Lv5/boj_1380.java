package Silver.Lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class boj_1380 { // 귀걸이
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int index = 1;

        do {
            String[] input = new String[n];
            ArrayList<Boolean> check = new ArrayList<Boolean>();

            for (int i = 0; i < n; i++) {
                check.add(false);
            }

            for (int i = 0; i < n; i++) {
                input[i] = br.readLine();
            }

            for (int i = 0; i < (2 * n - 1); i++) {
                int no = Integer.parseInt(br.readLine().split(" ")[0]) - 1;


                if (check.get(no)) {
                    check.set(no, false);
                } else {
                    check.set(no, true);
                }
            }

            bw.write(index + " " + input[check.indexOf(true)] + "\n");
            bw.flush();

            n = Integer.parseInt(br.readLine());
            index++;

        } while (n != 0);

        bw.close();
    }
}
