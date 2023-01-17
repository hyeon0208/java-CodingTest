package algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class Bfs {
    public static void main(String[] args) {
        // 각 노드가 연결상태를 2차원 배열로 표현
        int[][] graph = {{}, {2, 3}, {4}, {5, 6}, {2}, {5, 7}, {3}, {7}};

        // 방문처리에 사용 할 배열
        boolean[] visited = new boolean[graph.length];

        // 시작 노드
        int start = 1;

        // 큐 생성
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);

        // 현재 노드를 방문 처리
        visited[start] = true;

        // 큐가 비었을 때 까지 반복
        while (!queue.isEmpty()) {
            // 큐에서 하나의 원소를 뽑아 출력
            int node = queue.poll();
            System.out.print(node + " -> ");

            // 인접한 노드 중 아직 방문하지 않은 원소들을 큐에 삽입
            for (int index : graph[node]) {
                if (!visited[index]) {
                    queue.add(index);
                    visited[index] = true;
                }
            }
        }
    }
}
