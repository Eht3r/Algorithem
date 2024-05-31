package Lv1;

import java.util.HashMap;

public class pro_42576 { // 완주하지 못한 선수
    public String solution(String[] participant, String[] completion) {

        HashMap<String, Integer> map = new HashMap<>();

        for (String s : participant) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for (String s : completion) {
            map.put(s, map.getOrDefault(s, 0) - 1);
        }

        for (String key : map.keySet()) {
            if (map.get(key) == 1)
                return key;
        }

        return "";
    }
}
