import java.util.Stack;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;

        Stack<Integer> bergers = new Stack<>();

        for (int i : ingredient) {
            bergers.push(i);

            // 햄버거의 재료가 4개가 모였을 시 조건문 시작
            if (bergers.size() >= 4) {
                // 햄버거 패티의 재료 4가지가 순서에 맞게 다 들어 있는 경우
                if (bergers.get(bergers.size() - 4) == 1
                        && bergers.get(bergers.size() - 3) == 2
                        && bergers.get(bergers.size() - 2) == 3
                        && bergers.get(bergers.size() - 1) == 1) {
                    answer++;
                    bergers.pop();
                    bergers.pop();
                    bergers.pop();
                    bergers.pop();
                }
            }
        }
        return answer;
    }
}