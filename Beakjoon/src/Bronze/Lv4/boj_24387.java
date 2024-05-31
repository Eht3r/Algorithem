package Bronze.Lv4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class boj_24387 { // ИЗЛОЖЕНИЕ НА ПЧЕЛЕН МЕД
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Long> price = new ArrayList<>();
        List<Long> bottle = new ArrayList<>();

        String[] inputs = br.readLine().split(" ");

        for (String str : inputs) {
            price.add(Long.parseLong(str));
        }

        inputs = br.readLine().split(" ");

        for (String str : inputs) {
            bottle.add(Long.parseLong(str));
        }

        price.sort(Collections.reverseOrder());
        bottle.sort(Collections.reverseOrder());
        long result = 0;

        for (int i = 0; i < price.size(); i++) {
            result += price.get(i) * bottle.get(i);
        }

        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}
