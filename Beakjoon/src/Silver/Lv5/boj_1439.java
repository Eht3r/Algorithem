package Silver.Lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class boj_1439 { // 뒤집기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split("");
        List<String> list = getStrings(inputs);

        int count_of_0 = 0;
        int count_of_1 = 0;

        for (String s : list) {
            if (s.charAt(0) == '0') {
                count_of_0++;
            } else if (s.charAt(0) == '1') {
                count_of_1++;
            }
        }

        bw.write(Math.min(count_of_0, count_of_1) + "\n");
        bw.flush();
        bw.close();
    }

    private static List<String> getStrings(String[] inputs) {
        List<String> list = new ArrayList<String>();
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < inputs.length; i++) {
            if (i == 0) {
                temp = new StringBuilder(inputs[i]);
            } else {
                if (inputs[i-1].equals(inputs[i])) {
                    temp.append(inputs[i]);
                } else {
                    list.add(temp.toString());
                    temp = new StringBuilder(inputs[i]);
                }
            }
        }
        list.add(temp.toString());
        return list;
    }
}
