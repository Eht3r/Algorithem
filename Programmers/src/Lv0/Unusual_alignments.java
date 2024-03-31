package Lv0;

import java.util.Arrays;

public class Unusual_alignments { // 특이한 정렬
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        double[] distance = new double[numlist.length];

        for (int i = 0; i < numlist.length; i++)
            distance[i] = numlist[i] - n < 0 ? Math.abs(numlist[i] - n) + 0.5 : Math.abs(numlist[i] - n);

        Arrays.sort(distance);

        for (int i = 0; i < numlist.length; i++) {
            for (int j = 0; j < numlist.length; j++) {
                if (distance[i] == (numlist[j] - n < 0 ? Math.abs(numlist[j] - n) + 0.5 : Math.abs(numlist[j] - n))) {
                    answer[i] = numlist[j];
                    break;
                }
            }
        }

        return answer;
    }
}
