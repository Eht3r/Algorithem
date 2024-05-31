package Lv2;

import java.util.Arrays;

public class pro_42747 { // H-Index
    public int solution(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);

        for(int i = 0; i < citations.length; i++){
            answer = Math.max(answer, Math.min(citations[i], citations.length - i));
        }

        return answer;
    }
}
