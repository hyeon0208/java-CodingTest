package highscorekit.hash;

import java.util.HashSet;
import java.util.Set;

public class 폰켓몬 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 1, 2, 3}));
    }

    public static int solution(int[] nums) {
        int answer = 0;
        int pickCount = nums.length / 2;

        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }

        answer = set.size() > pickCount ? pickCount : set.size();


        return answer;
    }
}
