import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = nums.length / 2;

        Set<Integer> numberSet = new HashSet<>();

        for (int num : nums) {
            numberSet.add(num);
        }
        if (numberSet.size() > answer) {
            return answer
        }
        return numberSet.size()
    }
}