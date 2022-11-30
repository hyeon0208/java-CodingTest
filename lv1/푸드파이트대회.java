import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public String solution(int[] food) {
        String answer = "";
        List<String> left = new ArrayList<>();
        List<String> right = new ArrayList<>();

        for(int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i] / 2; j++) {
                left.add(Integer.toString(i));
                right.add(Integer.toString(i));
            }
        }

        answer += leftToString(left) + "0" + rightToString(right);

        return answer;
    }

    private static String leftToString(List<String> left) {
        String leftString = left.stream()
                .map(n -> String.valueOf(n))
                .collect(Collectors.joining());
        return leftString;
    }

    private static String rightToString(List<String> right) {
        String rightString = right.stream()
                .sorted(Comparator.reverseOrder())
                .map(n -> String.valueOf(n))
                .collect(Collectors.joining());
        return rightString;
    }
}