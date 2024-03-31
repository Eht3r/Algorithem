package Lv1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class pro_131130 {
    public int solution(int[] cards) {
        int n = cards.length;
        boolean[] check = new boolean[n];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int now = i;
            int cnt = 0;

            while (!check[now]) {
                check[now] = true;
                now = cards[now] - 1;
                cnt++;
            }
            list.add(cnt);
        }

        Collections.sort(list, Comparator.reverseOrder());
        return (list.size() == 1) ? 0 :list.get(0) * list.get(1);
    }

    public static void main(String[] args) throws IOException {
        pro_131130 sol = new pro_131130();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] cards = {8, 6, 3, 7, 2, 5, 1, 4};

        bw.write(String.valueOf(sol.solution(cards)));
        bw.flush();
        bw.close();
    }
}
