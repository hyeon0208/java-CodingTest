import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> map = new HashMap<>();

        for (String name : participant) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        for (String name : completion) {
            map.put(name, map.get(name) - 1);
            System.out.println(map);
        }

        for (String key : map.keySet()) {
            // 값이 하나 이상 있을 경우
            if (map.get(key) > 0) {
                answer = key;
                break;
            }
        }
        return answer;
    }
}