import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 주식가격 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 2, 3})));
    }

    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Queue<Integer> q = new LinkedList<>();

        for (int i : prices) {
            q.add(i);
        }

        int index = 0;
        while (!q.isEmpty()) {
            int currentPrice = q.poll();
            // currentPrice의 다음 가격부터 반복문을 진행 = i = (prices.length - q.size()
            for (int i = (prices.length - q.size()); i < prices.length; i++) {
                // 가격이 떨어 졌을 경우
                if (currentPrice > prices[i]) {
                    answer[index]++;
                    break;
                }
                // 가격이 떨어지지 않았을 경우
                if (currentPrice <= prices[i]) {
                    answer[index]++;
                }
            }
            index++;
        }
        return answer;
    }
}
