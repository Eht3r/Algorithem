package Silver.Lv2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class boj_4358 { // 생태학
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String, Integer> map = new HashMap<String, Integer>();
        String input = "";
        int total = 0;
        while ((input = br.readLine()) != null) {
            total++;
            map.put(input, map.getOrDefault(input, 0) + 1);
        }

        List<String> list = new ArrayList<String>();
        for (Entry<String, Integer> entry : map.entrySet()) {
            String tree = entry.getKey();
            list.add(tree);
        }

        Collections.sort(list);
        for (String tree : list) {
            double percent = (double) (map.get(tree) * 100) / (double) total;
            bw.write(tree + " " + String.format("%.4f", percent) + "\n");
        }

        bw.flush();
        bw.close();
    }
}
