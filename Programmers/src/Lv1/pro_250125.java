package Lv1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class pro_250125 { // [PCCE 기출문제] 9번 / 이웃한 칸

    public int solution(String[][] board, int h, int w) {
        int n = board.length;
        int answer = 0;

        int[] dh = {0, 1, -1, 0};
        int[] dw = {1, 0, 0, -1};

        for (int i = 0; i < 4; i++) {
            int h_check = h + dh[i];
            int w_check = w + dw[i];

            if ((0 <= h_check && h_check < n) && (0 <= w_check && w_check < n)) {
                if (board[h][w].equals(board[h_check][w_check])) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        pro_250125 sol = new pro_250125();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[][] board = {{"blue", "red", "orange", "red"},
                {"red", "red", "blue", "orange"},
                {"blue", "orange", "red", "red"},
                {"orange", "orange", "red", "blue"}};
        int h = 1;
        int w = 1;

        bw.write(String.valueOf(sol.solution(board, h, w)));
        bw.flush();
        bw.close();
    }
}
