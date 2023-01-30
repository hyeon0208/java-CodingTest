import java.util.Arrays;

public class 피로도 {
    private static int answer;
    private static boolean[] visit;

    public static void main(String[] args) {
        System.out.println(solution(80, new int[][]{{80, 20}, {50, 40}, {30, 10}}));
    }

    public static int solution(int k, int[][] dungeons) {
        int depth = 0;
        visit = new boolean[dungeons.length];

        dfs(depth, k, dungeons);

        return answer;
    }

    private static void dfs(int depth, int k, int[][] dungeons) {
        for (int i = 0; i < dungeons.length; i++) {
            if (!visit[i] && k >= dungeons[i][0]) {
                visit[i] = true;
                dfs(depth + 1, k - dungeons[i][1], dungeons);
                visit[i] = false;
            }
            System.out.println(Arrays.toString(visit) +  " : " + depth + " : " + k);
        }
        answer = Math.max(answer, depth);
    }
}
