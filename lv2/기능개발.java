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
        Queue<Integer> workDays = new LinkedList<>();

        int success = 0;

        // 작업 일 수 구하기
        for (int i = 0; i < progresses.length; i++) {
            int count = 0;
            success = progresses[i];

            while (success < 100) {
                success += speeds[i];
                count++;
            }
            workDays.add(count);
        }

        // 배포가능 한 기능 수 구하기
        while (!workDays.isEmpty()) {
            int currentWork = workDays.poll();
            int function = 1;

            while(!workDays.isEmpty() && currentWork >= workDays.peek()) {
                function++;
                workDays.poll();
            }
            answer.add(function);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
