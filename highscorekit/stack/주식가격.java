package highscorekit.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 주식가격 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {1, 2, 3, 2, 3})));

    }

    public static int[] solution(int[] prices) {
        List<Integer> answer = new ArrayList<>(prices.length);

        Queue<Integer> queue = new LinkedList<>();
        Arrays.stream(prices).forEach(n -> queue.add(n));

        while (!queue.isEmpty()) {
            int sec = 0;
            int currentPrice = queue.poll();

            for (int i = prices.length - queue.size(); i < prices.length; i++) {
                if (currentPrice <= prices[i]) {
                    sec++;
                }

                if (currentPrice > prices[i]) {
                    sec++;
                    break;
                }
            }
            answer.add(sec);
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}