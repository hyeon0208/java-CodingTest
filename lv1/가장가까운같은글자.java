import java.util.*;

class 가장가까운같은글자 {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String[] clone = new String[s.length()];
        String[] sArr = s.split("");

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < sArr.length; i++) {
            if (map.get(sArr[i]) == null) {
                //없으면 -1
                answer[i] = -1;
                map.put(sArr[i], 0);
                clone[i] = sArr[i];
            } else {
                //있던 것이면
                int temp = Arrays.asList(clone).lastIndexOf(sArr[i]);

                clone[i] = sArr[i];
                answer[i] = i - temp;
            }
        }
        return answer;
    }
}