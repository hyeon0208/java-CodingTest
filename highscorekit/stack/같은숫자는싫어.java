package highscorekit.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicBoolean;

public class 같은숫자는싫어 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {1,1,3,3,0,1,1})));
    }

    public static int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();

        // 첫 번째 값은 무조건 추가 되므로 무의미한 수 선언
        int current = 111;
        for (Integer next : arr) {
            if (current != next) {
                answer.add(next);
            }
            current = next;
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
