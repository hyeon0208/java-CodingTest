import java.util.Arrays;

public class 쿼드압축후개수세기 {
    static int[] answer;

    public static void main(String[] args) {
        int[][] arr = {{1, 1, 0, 0}, {1, 0, 0, 0}, {1, 0, 0, 1}, {1, 1, 1, 1}};
        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int[][] arr) {
        answer = new int[2];
        quad(arr.length, 0, 0, arr);

        return answer;
    }

    public static void quad(int size, int x, int y, int[][] arr) {
        // 크기가 1이라면 압축할 수 없으므로 1증감시키고 종료.
        if (size == 1) {
            answer[arr[x][y]]++;
            return;
        }

        // 나눈 블럭의 값들이 같은 값인지 체크 모두 같다면 블럭을 나누지 않고 종료.
        if (isSameBlock(size, x, y, arr)) {
            return;
        }

        // 4등분
        quad(size / 2, x, y, arr); // 1 사분면
        quad(size / 2, x, y + size / 2, arr); // 2 사분면
        quad(size / 2, x + size / 2, y, arr); // 3 사분면
        quad(size / 2, x + size / 2, y + size / 2, arr); // 4 사분면
    }

    public static boolean isSameBlock(int size, int x, int y, int[][] arr) {
        int currentValue = arr[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                // 서로 다른 값이라면 false를 반환하고 종료.
                if (currentValue != arr[i][j]) {
                    return false;
                }
            }
        }
        // 나눈 블럭에서의 수들이 모두 값은 값이라면 해당 값의 갯수를 증가시킨다.
        answer[currentValue]++;
        return true;
    }
}
