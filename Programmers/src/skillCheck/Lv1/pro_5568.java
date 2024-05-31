package skillCheck.Lv1;

import java.util.Stack;

public class pro_5568 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        for (int index : moves) {
            for (int i = 0; i < board.length; i++) {
                int doll = board[i][index - 1];
                if (doll != 0) {
                    if (!stack.isEmpty()) {
                        if (stack.peek() == doll) {
                            stack.pop();
                            answer++;
                        } else {
                            stack.push(doll);
                        }
                    } else {
                        stack.push(doll);
                    }
                    board[i][index - 1] = 0;
                    break;
                }
            }
        }

        return answer*2;
    }
}
