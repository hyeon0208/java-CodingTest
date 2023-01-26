import java.util.HashSet;
import java.util.Set;

public class 연속부분수열합 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{7, 9, 1, 1, 4}));
    }

    public static int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();

        int start = 1;
        while (start <= elements.length) {
            for (int i = 0; i < elements.length; i++) {
                int value = 0;
                for (int j = i; j < i + start; j++) {
                    value += elements[j % elements.length];
                }
                set.add(value);
            }
            start++;
        }

        return set.size();
    }
}
