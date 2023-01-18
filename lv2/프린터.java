import java.util.Collections;
import java.util.PriorityQueue;


public class 프린터 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 1, 3, 2}, 2));
        System.out.println(solution(new int[] {1, 1, 9, 1, 1, 1}, 0));
    }

    public static int solution(int[] priorities, int location) {
        int answer = 0;

        PriorityQueue<Integer> waitingLists = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : priorities) {
            waitingLists.add(num);
        }

        while (!waitingLists.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (waitingLists.peek() == priorities[i]) {
                    waitingLists.poll();
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
