package Lv1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class pro_120868 { // 삼각형의 완성조건 (2)
    public int solution(int[] sides) {
        int answer = 0;
        int max = Math.max(sides[0], sides[1]);

        if(max == 2) return 1;
        else {
            int min = Math.min(sides[0], sides[1]);
            int sum = sides[0] + sides[1];
            int temp = max - min + 1;
            answer += max - temp + 1;

            temp = max + 1;
            answer += sum - temp;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        pro_120868 sol = new pro_120868();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] sides = {11, 7};

        bw.write(String.valueOf(sol.solution(sides)));
        bw.flush();
        bw.close();
    }
}
