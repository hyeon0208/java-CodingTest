package highscorekit.dfs_bfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 네트워크 {
    static boolean[] visited;

    public static void main(String[] args) {
        int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        System.out.println(solution(3, computers));
    }

    public static int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                answer++;
                dfs(computers, i);
            }
        }

        return answer;
    }

    private static void dfs(int[][] computers, int i) {
        visited[i] = true;

        for (int j = 0; j < computers.length; j++) {
            // computer[i][i] 자기자신은 항상 1
            // !visited[i] && computers[depth][i]은 자기자신이 아닌 것.
            if (!visited[j] && computers[i][j] == 1) {
                dfs(computers, j);
            }
        }
    }
}
