package skillCheck.Lv1;

import java.util.HashMap;

public class pro_11786 {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < survey.length; i++) {
            int num = choices[i];
            String str = survey[i];
            if (num < 4) {
                if (map.containsKey(str.charAt(0))) {
                    map.put(str.charAt(0), map.get(str.charAt(0)) + num);
                } else {
                    map.put(str.charAt(0), num);
                }
                if (!map.containsKey(str.charAt(1))) {
                    map.put(str.charAt(1), 0);
                }
            } else if (num == 4) {
                if (!map.containsKey(str.charAt(0)) || !map.containsKey(str.charAt(1))) {
                    map.put(str.charAt(1), 0);
                }
            } else {
                if (!map.containsKey(str.charAt(0))) {
                    map.put(str.charAt(1), 0);
                }
                if (map.containsKey(str.charAt(1))) {
                    map.put(str.charAt(0), map.get(str.charAt(0)) + num);
                } else {
                    map.put(str.charAt(0), num);
                }
            }
        }

        answer += map.get('R')>map.get('T') ? "R" : "T";
        answer += map.get('C')>map.get('F') ? "C" : "F";
        answer += map.get('J')>map.get('M') ? "J" : "M";
        answer += map.get('A')>map.get('N') ? "A" : "N";

        return answer;
    }
}
