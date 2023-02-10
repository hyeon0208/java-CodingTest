package highscorekit.bruteforce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class 모음사전 {
    static boolean[] visited;
    static List<String> wordLists;
    static String[] wordKids = {"A", "E", "I", "O", "U"};

    public static void main(String[] args) {
        System.out.println(solution("AAAAE"));
        System.out.println(solution("AAAE"));
        System.out.println(solution("I"));
        System.out.println(solution("EIO"));
    }

    public static int solution(String word) {
        int answer = 0;
        visited = new boolean[5];
        wordLists = new ArrayList<>();

        dfs(word, "", 0);

        Collections.sort(wordLists);
        answer = wordLists.indexOf(word) + 1;

        return answer;
    }

    public static void dfs(String word, String str, int depth) {
        if (wordLists.contains(word)) {
            return;
        }

        if (depth == 5) {
            return;
        }

        for (int i = 0; i < wordKids.length; i++) {
            wordLists.add(str + wordKids[i]);
            dfs(word, str + wordKids[i], depth + 1);
        }
    }
}
