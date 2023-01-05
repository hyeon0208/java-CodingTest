public class 점프와순간이동 {
    public static void main(String[] args) {
        System.out.println(solution(5));
    }

    public static int solution(int n) {
        int ans = 0;

        while (n != 0) {
            if (n % 2 == 0) {
                n /= 2;
            }

            if (n % 2 == 1) {
                n--;
                ans++;
            }
        }
        return ans;
    }
}
