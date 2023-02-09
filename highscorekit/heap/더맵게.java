package highscorekit.heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class 더맵게 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 9, 10, 12}, 7));
    }

    public static int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Arrays.stream(scoville).forEach(n -> pq.add(n));

        if (scoville.length < 2) {
            return -1;
        }

        while (pq.peek() < K) {
            if (pq.isEmpty()) {
                break;
            }
            int min1 = pq.poll();
            int min2 = pq.poll();

            pq.add(min1 + (min2 * 2));
            answer++;

            System.out.println(pq);
        }

        return answer;
    }
}
