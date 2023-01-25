package algorithm;

import java.util.Arrays;

public class LIS_DP {
    public static void main(String[] args) {
        int arr[] = {3, 2, 4, 1, 6};
        int dp[] = new int[arr.length];
        dp[0] = 1; // LIS의 첫 번째는 항상 1이다.

        for (int i = 1; i < arr.length; i++) {
            // 첫 원소부터 i원소 전까지 비교
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
                //  증가 부분 수열의 길이는 1부터 시작하므로 0인 값을 1으로 변경해준다.
                if (dp[i] == 0) {
                    dp[i] = 1;
                }
            }
        }

        System.out.println("arr : " + Arrays.toString(arr));
        System.out.println("DP  : " + Arrays.toString(dp));
    }
}
