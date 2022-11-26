import java.util.*;

class Solution {
    public static int[] solution(int N, int[] stages) {
        int[] failCount = new int[N];
        Map<Integer, Double> rate = new LinkedHashMap<>();
        Arrays.sort(stages);

        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < stages.length; j++) {
                if (stages[j] == i) {
                    failCount[i-1] += 1;
                }
            }
        }

        int denominator = stages.length;
        for (int i = 0; i < failCount.length; i++) {
            double failRate = 0;
            int numerator = failCount[i];
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

        List<Integer> failRates = new ArrayList<>(rate.keySet());
        Collections.sort(failRates, (o1, o2) -> Double.compare(rate.get(o2), rate.get(o1)));

        return failRates.stream().mapToInt(Integer::intValue).toArray();
    }
}