package Lv0;

import java.util.Arrays;

public class Kth_Number { // K번째 수
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0] - 1;
            int end = commands[i][1];
            int k = commands[i][2] - 1;

            int[] temp = new int[end - start];

            for (int j = start; j < end; j++)
                temp[j - start] = array[j];

            Arrays.sort(temp);
            answer[i] = temp[k];
        }

        return answer;
    }
}
