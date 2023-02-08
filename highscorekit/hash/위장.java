package highscorekit.hash;

import java.util.HashMap;
import java.util.Map;

public class 위장 {
    public static void main(String[] args) {
        String[][] clothes1 = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        String[][] clothes2 = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(solution(clothes1));
        System.out.println(solution(clothes2));
    }

    public static int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> kinds = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            kinds.put(clothes[i][1], kinds.getOrDefault(clothes[i][1], 0) + 1);
        }

        // + 1 은 해당 옷 종류를 입지 않을 경우를 포함.
        for (int i : kinds.values()) {
            answer *= i + 1;
        }

        // 아무것도 입지 않는 경우 제외
        return answer - 1;
    }
}
