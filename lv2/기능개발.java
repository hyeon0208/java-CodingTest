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
        Queue<Integer> workDays = getWorkDays(progresses, speeds);
        int[] answer = getDistributionCount(workDays);

        return answer;
    }

    // 작업 일 수 구하는 함수
    private static Queue<Integer> getWorkDays(int[] progresses, int[] speeds) {
        int success = 0;
        Queue<Integer> workDays = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            int count = 0;
            success = progresses[i];

            while (success < 100) {
                success += speeds[i];
                count++;
            }
            workDays.add(count);
        }
        return workDays;
    }

    // 배포가능 한 기능 수 구하는 함수
    private static int[] getDistributionCount(Queue<Integer> workDays) {
        List<Integer> answer = new ArrayList<>();

        while (!workDays.isEmpty()) {
            int currentWork = workDays.poll();
            int function = 1;

            // 작업 시간이 같은 경우에도 같은 날에 배포가 되므로 ">="
            while (!workDays.isEmpty() && currentWork >= workDays.peek()) {
                function++;
                workDays.poll();
            }
            answer.add(function);
        }

        // List를 int[] 배열로 변환
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
