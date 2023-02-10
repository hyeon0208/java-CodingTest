package highscorekit.dfs_bfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import org.w3c.dom.Node;

public class 게임맵최단거리 {
    static boolean[][] visited;
    static int answer;

    // 상하좌우 이동할 수 있는 좌표
    static int[] dx = {0, 1, -1, 0};
    static int[] dy = {1, 0, 0, -1};

    public static void main(String[] args) {
        int[][] maps = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};
        System.out.println(solution(maps));
    }

    public static int solution(int[][] maps) {
        int xLen = maps.length;
        int yLen = maps[0].length;
        visited = new boolean[maps.length][maps[0].length];

        // 0이면 벽이므로 0의 위치를 방문 처리
        for (int x = 0; x < xLen; x++) {
            for (int y = 0; y < yLen; y++) {
                if (maps[x][y] == 1) {
                    continue;
                }
                if (maps[x][y] == 0) {
                    visited[x][y] = true;
                }
            }
        }
        bfs(maps);
        System.out.println(Arrays.deepToString(visited));

        return answer == 0 ? -1 : answer;
    }


    public static void bfs(int[][] maps) {

        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(0, 0, 1));
        visited[0][0] = true;
        int xLen = maps.length;
        int yLen = maps[0].length;

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            // 상하좌우로 움직이므로 4까지 탐색
            for (int i = 0; i < 4; i++) {
                int x = node.x + dx[i];
                int y = node.y + dy[i];

                // 좌표가 maps에서 벗어날 경우 다음 반복으로 넘어간다.
                if (xLen <= x || x < 0 || yLen <= y || y < 0) {
                    continue;
                }

                // 방문한 곳을 continue 처리해야 시간 초과 통과
                if (visited[x][y]) {
                    continue;
                } else {
                    queue.offer(new Node(x, y, node.m + 1));
                    visited[x][y] = true;
                }

                // 끝에 도달 했을 때
                if(x == xLen - 1 && y == yLen - 1) {
                    answer = node.m + 1;
                }
            }
        }
    }

    private static class Node {
        int x;
        int y;
        int m;

        public Node(int x, int y, int m) {
            this.x = x;
            this.y = y;
            this.m = m;
        }
    }
}
