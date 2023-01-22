public class 타겟넘버 {
    static int answer = 0;

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 1, 1, 1, 1}, 3));
        System.out.println(solution(new int[]{4, 1, 2, 1}, 2));
    }

    public static int solution(int[] numbers, int target) {
        answer = 0;

        dfs(numbers, target, 0, 0);

        return answer;
    }

    public static void dfs(int[] numbers, int target, int depth, int sum) {
        // 마지막 노드 까지 탐색한 경우
        if (depth == numbers.length) {
            if (target == sum) { // 합이 target과 같다면 answer++후 메서드 종료.
                answer++;
            }
            return;
        }
        int plus = sum + numbers[depth];
        int minus = sum - numbers[depth];

        dfs(numbers, target, depth + 1, plus); // 해당 노드의 값을 더하고 다음 깊이 탐색
        dfs(numbers, target, depth + 1, minus); // 해당 노드의 값을 빼고 다음 깊이 탐색
    }
}
