package Silver.Lv3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class boj_2910 { // 빈도 정렬
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int C = Integer.parseInt(input[1]);
        input = br.readLine().split(" ");

        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(input[i]));
            map.put(Integer.parseInt(input[i]), map.getOrDefault(Integer.parseInt(input[i]), 0) + 1);
        }

        List<Integer> keySet = new ArrayList<>(map.keySet());
        keySet.sort((a, b) -> {
            int num = 0;

            if (map.get(a).equals(map.get(b))) {
                if (list.indexOf(a) < list.indexOf(b)) num = -1;
                else if (list.indexOf(a) > list.indexOf(b)) num = 1;
            } else num = map.get(b).compareTo(map.get(a));

            return num;
        });

        for (int key : keySet) {
            for (int i = 0; i < map.get(key); i++)
                bw.write(key + " ");
        }

        bw.flush();
        bw.close();
    }
}
