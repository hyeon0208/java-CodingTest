package highscorekit.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class 베스트앨범 {
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        System.out.println(Arrays.toString(solution(genres, plays)));
    }

    public static int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> playCounts = new HashMap<>(); // 장르별 총 재생 횟수

        for (int i = 0; i < genres.length; i++) {
            playCounts.put(genres[i], playCounts.getOrDefault(genres[i], 0) + plays[i]);
        }

        // playCounts의 값 기준 내림차순
        List<String> bestMusics = new ArrayList(playCounts.keySet());
        Collections.sort(bestMusics, (s1, s2) -> playCounts.get(s2) - (playCounts.get(s1)));

        List<Integer> answer = new ArrayList<>();
        for (String genre : bestMusics) {
            List<Music> music = new ArrayList<>();

            for (int i = 0; i < genres.length; i++) {
                if (genre.equals(genres[i])) {
                    music.add(new Music(genres[i], i, plays[i]));
                }
            }

            // Override한 정렬 기준으로 정렬
            Collections.sort(music);

            // 장르에 속한 곡이 하나라면, 하나의 곡만 추가
            answer.add(music.get(0).index);
            if (music.size() > 1) {
                answer.add(music.get(1).index);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static class Music implements Comparable<Music> {
        String genre;
        int index;
        int count;

        public Music(String genre, int index, int count) {
            this.genre = genre;
            this.index = index;
            this.count = count;
        }

        // 재생 횟수 별 내림차순, 같으면 인덱스별 오름차순
        @Override
        public int compareTo(Music o) {
            int sort = o.count - this.count;
            if (sort == 0) {
                sort = this.index - o.index;
            }
            return sort;
        }

        @Override
        public String toString() {
            return "장르 : " + genre + " - 번호 : " + index + " - 재생 수 : " + count;
        }
    }
}
