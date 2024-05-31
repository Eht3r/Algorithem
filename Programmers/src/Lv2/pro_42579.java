package Lv2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class pro_42579 { // 베스트앨범
    public int[] solution(String[] genres, int[] plays) {
        ArrayList<Integer> answer = new ArrayList<>();

        HashMap<String, Integer> genres_plays = new HashMap<>();
        HashMap<String, HashMap<Integer,Integer>> music = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            if (!genres_plays.containsKey(genres[i])) {
                genres_plays.put(genres[i], genres_plays.getOrDefault(genres[i], 0) + plays[i]);
                HashMap<Integer, Integer> map = new HashMap<>();
                map.put(i, plays[i]);
                music.put(genres[i], map);
            }else {
                music.get(genres[i]).put(i, plays[i]);
                genres_plays.put(genres[i], genres_plays.get(genres[i]) + plays[i]);
            }
        }

        List<String> keys = new ArrayList<>(genres_plays.keySet());
        keys.sort((v1, v2) -> (genres_plays.get(v2) - genres_plays.get(v1)));

        for (String key : keys) {
            HashMap<Integer, Integer> map = music.get(key);
            List<Integer> gen_key = new ArrayList<>(map.keySet());

            gen_key.sort((v1, v2) -> (map.get(v2) - map.get(v1)));

            answer.add(gen_key.get(0));
            if (gen_key.size() > 1)
                answer.add(gen_key.get(1));
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}
