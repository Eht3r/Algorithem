package Lv1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class pro_250137 { // [PCCP 기출문제] 1번 / 붕대 감기
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health;
        int time = 1;
        int continuity = 0;
        int attackIdx = 0;

        while (answer > 0) {
            if (attackIdx < attacks.length && time == attacks[attackIdx][0]) {
                answer -= attacks[attackIdx][1];
                attackIdx++;
                continuity = 0;
            } else {
                answer += bandage[1];
                continuity++;
                if (continuity == bandage[0]) {
                    answer += bandage[2];
                    continuity = 0;
                }
            }

            if (health < answer) answer = health;
            if (attackIdx == attacks.length) break;

            time++;
        }

        if (answer <= 0) answer = -1;

        return answer;
    }

    public static void main(String[] args) throws IOException {
        pro_250137 sol = new pro_250137();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] bandage = {3, 2, 7};
        int health = 20;
        int[][] attacks = {{1, 15},
                {5, 16},
                {8, 6}};

        bw.write(String.valueOf(sol.solution(bandage, health, attacks)));
        bw.flush();
        bw.close();
    }
}
