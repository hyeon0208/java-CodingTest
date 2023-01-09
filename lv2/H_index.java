import java.util.Arrays;

public class H_index {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 0, 6, 1, 5}));
        System.out.println(solution(new int[]{10, 8, 5, 4, 3}));
        System.out.println(solution(new int[]{20, 8, 5, 3, 3}));
        System.out.println(solution(new int[]{1}));
        System.out.println(solution(new int[]{22, 42}));
    }

    public static int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);

        for (int i = 0; i < citations.length; i++) {
            int discussionCount = citations.length - i;

            if (citations[i] >= discussionCount) {
                answer = discussionCount;
                break;
            }
        }
        return answer;
    }
}
