package highscorekit.heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class 디스크컨트롤러 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{0, 3}, {1, 9}, {2, 6}}));
    }

    public static int solution(int[][] jobs) {
        int answer = 0;
        int end = 0; // 수행되고난 직후의 시간
        int index = 0;
        int successJop = 0; // 완료된 작업 수

        Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]);
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);

        while (successJop < jobs.length) {
            // 앞의 작업이 종료된 시점보다 앞에 있는 작업들을 추가.
            while (index < jobs.length && jobs[index][0] <= end) {
                pq.add(jobs[index++]);
            }
            // 큐가 비어있다면 앞의 작업이 종료된 이후에 다시 요청이 들어온다는 의미
            if (pq.isEmpty()) {
                end = jobs[index][0];
                // 비어 있지 않다면 pq 앞 부터 작업 완료 처리
            } else {
                int[] temp = pq.poll();
                answer += temp[1] + end - temp[0];
                end += temp[1];
                successJop++;
            }
        }

        return (int) Math.floor(answer / jobs.length);
    }
}
