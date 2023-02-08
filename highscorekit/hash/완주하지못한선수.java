package highscorekit.hash;

import java.util.HashMap;
import java.util.Map;

public class 완주하지못한선수 {
    public static void main(String[] args) {
        System.out.println(solution(new String[] {"leo", "kiki", "eden"}, new String[] {"eden", "kiki"}));
        System.out.println(solution(new String[] {"mislav", "stanko", "mislav", "ana"}, new String[] {"stanko", "ana", "mislav"}));
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> player = new HashMap<>();

        for (String name : participant) {
            player.put(name, player.getOrDefault(name, 0) + 1);
        }

        for (String name : completion) {
            player.put(name, player.getOrDefault(name, 0) - 1);
        }

        for (String name : player.keySet()) {
            if (player.get(name) == 1) {
                answer = name;
                break;
            }
        }

        return answer;
    }
}
