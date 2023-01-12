package algorithm;

public class bigO {
    public static void main(String[] args) {
        O_1();
        O_n(5);
        O_n2(3);
        System.out.println(O_2n(5));
    }

    private static void O_1() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7};
        int index = 3;
        System.out.println(arr[index]); // 3
    }

    private static void O_n(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i); // n : 5 일때 => 01234
        }
    }

    private static void O_n2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("i : " + i + " - j : " + j);
            }
        }
    }

    private static int O_2n(int n) {
        if (n <= 1) {
            return 1;
        }
        // 피보나치 수열의 재귀적 호출
        return O_2n(n - 1) + O_2n(n - 2); // n이 5 일 때 => 8
    }
}
