package Lv1;

import java.util.Stack;

public class pro_12906 { // 같은 숫자는 싫어
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();

        for (int j : arr) {
            if (!stack.isEmpty()) {
                if (stack.peek() != j)
                    stack.push(j);
            } else stack.push(j);
        }

        int[] answer = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }
        return answer;
    }
}
