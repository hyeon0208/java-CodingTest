package highscorekit.stack;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를지나는트럭 {
    public static void main(String[] args) {
        System.out.println(solution(2, 10, new int[]{7, 4, 5, 6}));
        System.out.println(solution(100, 100, new int[]{10}));
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = bridge_length;
        int totalWeight = 0;
        int time = 0;
        Queue<Integer> onBridge = new LinkedList<>();

        for (int truck : truck_weights) {
            while (true) {
                if (onBridge.isEmpty()) {
                    onBridge.add(truck);
                    totalWeight += truck;
                    time++;
                    break;
                    // 다리 길이만큼 큐가 채워졌다면 맨 앞에 있는 트럭을 제외하고 무게합계에서 해당 트럭의 무게를 뺀다.
                } else if (onBridge.size() == bridge_length) {
                    totalWeight -= onBridge.poll();
                } else { // 다리 길이만큼 큐가 채워지지 않았을 경우
                    // 현재 총 무게에 다음 트럭의 무게가 허용 무게를 넘지 않는다면 새 트럭을 추가한다.
                    if (totalWeight + truck <= weight) {
                        onBridge.add(truck);
                        totalWeight += truck;
                        time++;
                        break;
                    } else { // 넘는다면 0을 넣어 이미 큐에 있는 트럭이 다리를 건널 수 있도록 만든다.
                        onBridge.add(0);
                        time++;
                    }
                }
            }
        }
        answer += time;

        return answer;
    }
}