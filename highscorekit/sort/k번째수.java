package highscorekit.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class k번째수 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2,5,3,}, {4,4,1}, {1,7,3}};
        System.out.println(Arrays.toString(solution(array, commands)));
    }

    public static int[] solution(int[] array, int[][] commands) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < commands.length; i++) {
            int[] subArr = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(subArr);
            answer.add(subArr[commands[i][2] - 1]);
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}
