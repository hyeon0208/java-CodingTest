package highscorekit.sort;

import java.util.Arrays;
import java.util.Comparator;

public class H_index {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 0, 6, 1, 5}));
        System.out.println(solution(new int[]{4, 4, 4}));
        System.out.println(solution(new int[]{25, 8, 5, 3, 3}));

    }

    public static int solution(int[] citations) {
        int answer = 0;

        Integer[] arr = Arrays.stream(citations).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Comparator.reverseOrder());

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > answer) {
                answer++;
                continue;
            }
            if (arr[i] <= answer) {
                return answer;
            }
        }

        return answer;
    }
}
