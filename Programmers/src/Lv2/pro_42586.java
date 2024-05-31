package Lv2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class pro_42586 { // 기능 개발
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < progresses.length; i++) {
            int i1 = (100 - progresses[i]) / speeds[i];
            if ((100 - progresses[i]) % speeds[i] != 0)
                i1++;
            queue.add(i1);
        }

        while (!queue.isEmpty()) {
            int i1 = queue.poll();
            int count = 1;

            while (!queue.isEmpty() && i1 >= queue.peek()) {
                count++;
                queue.poll();
            }
            answer.add(i1);
        }

        return answer.stream().mapToInt(i->i).toArray();
    }
}
