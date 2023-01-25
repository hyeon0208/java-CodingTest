package algorithm;

import java.util.Arrays;

public class LIS_Binarysearch {
    public static void main(String args[]) {
        int[] arr = {3, 5, 7, 9, 2, 1, 4, 8};
        int size = arr.length;

        System.out.println("arr : " + Arrays.toString(arr));
        System.out.println("LIS 길이 : " + binarySearch(arr, size));
    }

    public static int binarySearch(int[] arr, int size) {
        int[] lis = new int[size + 1];    // 가장 긴 증가하는 부분 수열. 가장 뒤에 있는 값은 부분 수열 중 가장 최댓값
        int start = 0;
        lis[start++] = arr[0]; // lis[start] 값을 arr[i]로 변경하고 1증가시킨다.

        for (int i = 1; i < size; i++) {
            // lis값의 맨 마지막 원소가 arr[i] 보다 작을 경우
            if (lis[start - 1] < arr[i]) {
                lis[start++] = arr[i]; // 해당 원소를 arr[i]값으로 변경하고 start를 1 증가 시킨다.
            } else {
                int end = 0;
                while (start <= end) {
                    int mid = start + (end - start) / 2;

                    if (arr[mid] == arr[i]) {
                        return mid;
                    }
                    if (arr[mid] < arr[i]) {
                        start = mid + 1;
                    }
                    if (arr[mid] > arr[i]) {
                        end = mid - 1;
                    }
                }
                lis[start] = arr[i];
            }
        }

        return start;
    }
}
