public class n개의최소공배수 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 6, 8, 14}));
    }

    public static int solution(int[] arr) {
        int answer = arr[0];

        for (int i = 1; i < arr.length; i++) {
            System.out.print("| 현재 a 값 : " + answer + " | ");
                answer = lcm(answer, arr[i]);
                System.out.println(" 현재 b 값 : " + arr[i] + " | a, b의 최소공배수 : " + answer + " |");
        }
        return answer;
    }

    // 최대공약수
    private static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }

    // 최소공배수
    private static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
