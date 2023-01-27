package algorithm;

import java.util.Arrays;

public class TwoPointer {

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 4};
        Arrays.sort(arr);
        System.out.println(twoPointCount(arr));
    }

    private static int twoPointCount(int[] arr) {
        int count = 0, end = 0,start = 0, sum = 0;
        int findValue = 5;

        while (true) {
            // 부분합이 찾는 값보다 크거나 같다면
            if (sum >= findValue) {
                // 부분합이 찾고자하는 값과 같다면 count + 1
                if (sum == findValue) {
                    count++;
                }
                sum -= arr[start++]; // 현재 start 위치의 값을 빼고 start + 1

            // 배열의 길이를 넘어간다면 종료.
            } else if (end == arr.length) {
                break;

            // 부분합이 찾는 값보다 작다면, 현재 end 위치의 값을 더하고 end + 1
            } else if (sum < findValue) {
                sum += arr[end++];
            }
        }

        return count;
    }
}
