import java.util.*;

class Solution {
    public static int[] solution(int N, int[] stages) {
        int[] failUsers = new int[N];
        Map<Integer, Double> rate = new LinkedHashMap<>();
        Arrays.sort(stages);

        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < stages.length; j++) {
                if (stages[j] == i) {
                    failUsers[i-1] += 1;
                }
            }
        }

        int denominator = stages.length;
        for (int i = 0; i < failUsers.length; i++) {
            double failRate = 0;
            int numerator = failUsers[i];
            if (denominator == 0) {
                rate.put(i + 1, (double) 0);
                continue;
            }
            if (numerator == 0) {
                rate.put(i + 1, (double) 0);
                continue;
            }
            if(denominator != 0) {
                failRate = (double) numerator / denominator;
            }
            rate.put(i + 1, failRate);
            denominator -= numerator;
        }

        List<Integer> test = new ArrayList<>(rate.keySet());
        Collections.sort(test, (o1, o2) -> Double.compare(rate.get(o2), rate.get(o1)));

        return test.stream().mapToInt(Integer::intValue).toArray();
    }
}