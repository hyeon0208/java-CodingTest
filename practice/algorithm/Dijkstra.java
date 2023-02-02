package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Dijkstra {
    static int nodeCount = 4; // 노드 수
    static int lineCount = 7; // 정점 수 (입력값을 받지 않으므로 여기선 사용 X)
    static int start = 1; // 시작 정점
    static List<Node>[] graph = new ArrayList[nodeCount + 1];

    public static void main(String[] args) {
        for (int i = 1; i < nodeCount + 1; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[1].add(new Node(2, 13));
        graph[1].add(new Node(3, 21));
        graph[1].add(new Node(4, 42));
        graph[2].add(new Node(1, 8));
        graph[2].add(new Node(4, 17));
        graph[3].add(new Node(4, 12));
        graph[4].add(new Node(3, 6));
//        graph[1].add(new Node(2, 10));
//        graph[1].add(new Node(3, 5));
//        graph[2].add(new Node(3, 2));
//        graph[3].add(new Node(1, 1));
//        graph[3].add(new Node(2, 13));
//        graph[4].add(new Node(1, 8));
//        graph[4].add(new Node(5, 3));
//        graph[5].add(new Node(4, 9));
//        graph[5].add(new Node(2, 31));

        System.out.println("노드 연결 상태 : " + Arrays.toString(graph));

        Dijkstra(nodeCount, start);
    }

    public static void Dijkstra(int nodeCount, int start) {
        boolean[] visited = new boolean[nodeCount + 1];
        int[] distance = new int[nodeCount + 1];
        int INF = Integer.MAX_VALUE; // 무한대값

        Arrays.fill(distance, INF); // 거리 배열을 전부 무한대로 초기화
        distance[start] = 0; // 시작점의 값은 항상 0으로 시작

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(start, 0)); // pq에 시작노드와 시작노드의 값을 넣는다.

        while (!pq.isEmpty()) {
            int current = pq.poll().index;

            // 방문했다면 다음 큐를 꺼낸다.
            if (visited[current]) {
                continue;
            }

            // 방문하지 않은 노드를 방문 처리
            visited[current] = true;

            for (Node nextNode : graph[current]) {
                // 현재 노드의 거리 값 + 다음 노드로 가는 거리 값이 다음 노드의 값보다 작다면
                if (distance[nextNode.index] > distance[current] + nextNode.distance) {
                    // 현재 노드의 거리값을 갱신하고 pq에 해당 노드 추가
                    distance[nextNode.index] = distance[current] + nextNode.distance;
                    pq.add(new Node(nextNode.index, distance[nextNode.index]));
                }
            }
        }
        // 출력 부분
        for (int i = 1; i < nodeCount + 1; i++) {
            if (distance[i] == INF) {
                System.out.print("∞ ");
            } else {
                System.out.print(distance[i] + " ");
            }
        }
    }
}

class Node implements Comparable<Node> {
    int index;
    int distance;

    Node(int index, int distance) {
        this.index = index;
        this.distance = distance;
    }

    @Override
    // 오름차순 정렬
    public int compareTo(Node o) {
        return this.distance - o.distance;
    }

    @Override
    public String toString() {
        return String.format("%d번 노드로 가는 값 = %d", this.index, this.distance);
    }
}