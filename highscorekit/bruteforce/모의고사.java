package highscorekit.bruteforce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 모의고사 {
    private static final int STUDENT = 3;
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1,2,3,4,5})));
    }

    public static int[] solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        int[] result = new int[STUDENT];
        int[] s1 = {1,2,3,4,5};
        int[] s2 = {2,1,2,3,2,4,2,5};
        int[] s3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        List<int[]> students = new ArrayList<>(List.of(s1, s2, s3));

        for (int i = 0; i < STUDENT; i++) {
            for (int j = 0; j < answers.length; j++) {
                if (students.get(i)[j % students.get(i).length] == answers[j]) {
                    result[i]++;
                }
            }
        }

        List<Integer> total = new ArrayList<>();
        Arrays.stream(result).forEach(n -> total.add(n));
        int maxScore = Collections.max(total);

        if (maxScore == result[0]) {
            answer.add(1);
        }
        if (maxScore == result[1]) {
            answer.add(2);
        }
        if (maxScore == result[2]) {
            answer.add(3);
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}
