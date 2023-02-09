package highscorekit.heap;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class 이중우선순위큐 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"})));
        System.out.println(Arrays.toString(solution(new String[]{"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"})));

    }

    public static int[] solution(String[] operations) {
        int[] answer = new int[2];
        PriorityQueue<Integer> min = new PriorityQueue<>();
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());

        for (String s : operations) {
            String[] temp = s.split(" ");
            String command = temp[0];
            int commandNum = Integer.parseInt(temp[1]);

            if (command.equals("I")) {
                min.offer(commandNum);
                max.offer(commandNum);
            } else if (!min.isEmpty() && command.equals("D")) {
                if (commandNum < 0) {
                    int num = min.poll();
                    max.remove(num);
                    System.out.println(num);
                } else {
                    int num = max.poll();
                    min.remove(num);
                }
            }
        }

        if (!min.isEmpty()) {
            answer[0] = max.poll();
            answer[1] = min.poll();
        }

        return answer;
    }
}
