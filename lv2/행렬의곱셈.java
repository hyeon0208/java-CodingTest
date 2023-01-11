import java.util.Arrays;
import javax.swing.plaf.synth.SynthLookAndFeel;

public class 행렬의곱셈 {
    public static void main(String[] args) {
        int[][] arr1 = new int[][] {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr2 = new int[][] {{3, 3}, {3, 3}};
        System.out.println(Arrays.deepToString(solution(arr1, arr2)));

        int[][] arr3 = new int[][] {{2, 3, 2}, {4, 2, 4}, {3, 1, 4}};
        int[][] arr4 = new int[][] {{5, 4}, {2, 4}, {3, 1}};
        System.out.println(Arrays.deepToString(solution(arr3, arr4)));
    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                for (int k = 0; k < arr1[0].length; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                    System.out.println("arr1[i][k] : " + arr1[i][k] + " * arr2[k][j] : " + arr2[k][j]);
                }
                System.out.println("answer[i][j] : " + answer[i][j]);
            }
        }
        return answer;
    }
}
