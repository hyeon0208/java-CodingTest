import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> honors = new ArrayList(k);

        for (int i = 0; i < score.length; i++) {
            if (honors.size() < k) {
                honors.add(score[i]);
                Collections.sort(honors);
                answer[i] = honors.get(0);
                continue;
            }

            if (honors.size() == k) {
                int minNum = honors.get(0);
                if (minNum < score[i]) {
                    honors.remove(0);
                    honors.add(score[i]);
                    Collections.sort(honors);
                }
                answer[i] = honors.get(0);
            }
        }
        return answer;
    }
}