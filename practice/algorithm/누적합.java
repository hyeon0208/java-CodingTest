package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class 누적합 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 2, 5};
        int[] prefixSum = new int[arr1.length + 1];
        int sum = 0;

        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
            prefixSum[i + 1] = sum;
        }

        System.out.println("합을 구할 배열 : " + Arrays.toString(arr1));
        System.out.println("총합 : " + sum);
        System.out.println("누적합의 배열 : "+ Arrays.toString(prefixSum));
        System.out.println("=================================");

        // 구간합
        Scanner input = new Scanner(System.in);
        System.out.println("구간 합을 시작할 구간을 입력해주세요. : ");
        int a = input.nextInt();
        System.out.println("구간 합을 끝낼 구간을 입력해주세요. : ");
        int b = input.nextInt();

        System.out.print("누적합 결과 : ");
        System.out.println(prefixSum[b] - prefixSum[a - 1]);
    }
}
