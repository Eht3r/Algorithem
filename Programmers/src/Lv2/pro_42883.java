package Lv2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Stream;

public class pro_42883 {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();

        PriorityQueue<String> pq = new PriorityQueue<>();
        String[] arr = number.split("");

        List<String> list = new ArrayList<>();

        for (String i : arr) {
            list.add(i);
            pq.offer(i);
        }

        for (int i = 0; i < k; i++) {
            String num = pq.poll();
            list.remove(num);
        }

        for (String i : list) {
            answer.append(String.valueOf(i));
        }

        return answer.toString();
    }
}
