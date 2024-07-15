package Lv1;

import java.util.HashMap;

public class pro_1845 { // 폰켓몬
    public int solution(int[] nums) {
        int answer;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        answer = Math.min(nums.length /2, map.size());

        return answer;
    }
}
