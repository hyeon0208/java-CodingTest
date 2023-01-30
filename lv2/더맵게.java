import java.util.PriorityQueue;

public class 더맵게 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 9, 10, 12}, 7));
        System.out.println(solution(new int[]{2, 3, 8, 9, 10, 12}, 8));
        System.out.println(solution(new int[]{1}, 8));
    }

    public static int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i : scoville) {
            queue.add(i);
        }

        while (queue.peek() < K) {
            if (queue.size() <= 1) {
                return -1;
            }
            if (queue.peek() >= K) {
                break;
            }

            int firstMin = queue.poll();
            int secondMin = queue.poll();

            queue.add(firstMin + (secondMin * 2));
            answer++;
        }

        return answer;
    }
}
