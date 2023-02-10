package highscorekit.dfs_bfs;

public class 타겟넘버 {
    static int answer;

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 1, 1, 1, 1}, 3));
    }

    public static int solution(int[] numbers, int target) {
        answer = 0;
        dfs(numbers, target,0, 0);
        return answer;
    }

    public static void dfs(int[] numbers, int target, int depth, int sum) {
        if (depth == numbers.length) {
            if (sum == target) {
                answer++;
            }
            return;
        }

        int plus = sum + numbers[depth];
        int minus = sum - numbers[depth];

        dfs(numbers, target, depth + 1, plus);
        dfs(numbers, target, depth + 1, minus);
    }
}
