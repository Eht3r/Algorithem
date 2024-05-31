package Lv2;

import java.util.Stack;

public class pro_12909 { // 올바른 괄호
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    answer = false;
                    break;
                } else {
                    stack.pop();
                }
            }
            if (stack.isEmpty()) {
                answer = false;
                break;
            }
        }

        if (!stack.isEmpty()) {
            answer = false;
        }
        return answer;
    }
}
