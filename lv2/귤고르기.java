import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 귤고르기 {
    public static void main(String[] args) {
        System.out.println(solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3}));
        System.out.println(solution(4, new int[]{1, 3, 2, 5, 4, 5, 2, 3}));
        System.out.println(solution(2, new int[]{1, 1, 1, 1, 2, 2, 2, 3}));
    }

    public static int solution(int k, int[] tangerine) {
        int answer = 0;

        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < tangerine.length; i++) {
            map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
        }

        List<Integer> keys = new ArrayList<>(map.keySet());
        // value가 큰 순서대로 정렬 (내림차순)
        keys.sort(((o1, o2) -> map.get(o2) - map.get(o1)));

        System.out.println(map);
        System.out.println(keys);

        int i = 0;
        while (k > 0) {
            k -= map.get(keys.get(i));
            answer++;
            i++;
        }

        return answer;
    }
}
