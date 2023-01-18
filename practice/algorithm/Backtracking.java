package algorithm;

import java.util.Arrays;

public class Backtracking {
    static int[][] graph = {{}, {2, 3}, {4}, {5, 6}, {2}, {5, 7}, {3}, {7}};
    static boolean[] visited = new boolean[graph.length];
    static int n = graph.length;

    public static void main(String[] args) {

        for (int i = 1; i <= n; i++) {
            System.out.println("\n" + n + " 개 중에서 " + i + " 개 뽑기");
            backTracking(0, i);
        }
    }

    static void backTracking(int start, int r) {
        if (r == 0) {
            print();
            return;
        }
        if(start == n) {
            return;
        }
        visited[start] = true;
        backTracking(start + 1, r - 1);
        visited[start] = false;
        backTracking(start + 1, r);
    }

    static void print() {
        for (int i = 0; i < n; i++)
            if (visited[i]) {
                System.out.print(Arrays.toString(graph[i]) + " ");
            }
        System.out.println();
    }
}
