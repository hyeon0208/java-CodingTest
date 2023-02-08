package highscorekit.stack;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class 프린터 {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {2, 1, 3, 2}, 2));
        System.out.println(solution(new int[] {1, 1, 9, 1, 1, 1}, 0));
    }

    public static int solution(int[] priorities, int location) {
        int answer = 0;

        PriorityQueue<Integer> prints = new PriorityQueue<>(Comparator.reverseOrder());
        Arrays.stream(priorities).forEach(n -> prints.add(n));

        while (!prints.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (prints.peek() == priorities[i]) {
                    prints.poll();
                    answer++;
                    if (location == i) {
                        return answer;
                    }
                }
            }
        }
        return answer;
    }
}
