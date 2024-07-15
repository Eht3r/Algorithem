package Lv2;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class pro_42587 {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Arrays.stream(priorities).forEach(pq::offer);

        while(!pq.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (pq.peek() == priorities[i]) {
                    pq.poll();
                    answer++;

                    if (location == i) {
                        return answer;
                    }
                }
            }
        }


        return answer;
    }
}