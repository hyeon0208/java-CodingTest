package algorithm;

import java.util.Scanner;

public class Backtracking2 {
    public static int[] arr;
    public static boolean[] visited;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        arr = new int[m];
        visited = new boolean[n];
        dfs(n, m, 0);
    }

    public static void dfs(int n, int m, int depth) {
        if (depth == m) { // 배열의 길이 m만큼 다 찼을 경우
            for (int node : arr) {
                System.out.print(node + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true; // 방문 여부 표시
                arr[depth] = i + 1; // arr[인덱스]에 해당 값을 넣어 준다.
                dfs(n, m, depth + 1); // arr배열의 다음 칸을 채우기 위해 재귀
                visited[i] = false; // 반복문이 끝나면 방문 여부를 false로 초기화하여 재사용한다.
            }
        }
    }
}