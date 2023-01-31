import java.util.PriorityQueue;

public class 더맵게 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 9, 10, 12}, 7));
    }

    public static int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i : scoville) {
            queue.add(i);
        }

        while (queue.peek() < K) {
            // 큐의 크기가 1이랑 같거나 작으면 조합할 수 없다.
            if (queue.size() <= 1) {
                return -1;
            }
            // 스코빌 지수가 제일 낮은 음식이 K보다 크다면 종료
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
