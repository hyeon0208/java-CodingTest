package highscorekit.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 기능개발 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{93, 30, 55}, new int[]{1, 30, 5})));
        System.out.println(Arrays.toString(solution(new int[]{95, 90, 99, 99, 80, 99}, new int[]{1, 1, 1, 1, 1, 1})));

    }

    public static int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> workDay = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            int day = 0;
            int remainingWork = 100 - progresses[i];

            while (remainingWork > 0) {
                remainingWork -= speeds[i];
                day++;
            }
            workDay.add(day);
        }

        while (!workDay.isEmpty()) {
            int count = 1;
            int current = workDay.poll();

            while (!workDay.isEmpty() && current >= workDay.peek()) {
                count++;
                workDay.poll();
            }
            answer.add(count);
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}
