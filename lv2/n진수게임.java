public class n진수게임 {
    public static void main(String[] args) {
        System.out.println(solution(2, 4, 2, 1));
        System.out.println(solution(16, 16, 2, 1));
        System.out.println(solution(16, 16, 2, 2));
    }

    public static String solution(int n, int t, int m, int p) {
        String answer = "";
        String game = "";
        int gameCount = t * m;
        int num = 0;
        while(game.length() < gameCount){
            game += Integer.toString(num++, n);
        }

        // p - 1인 이유는 인덱스로 순서를 나타내기 위해서
        // i += m은 다음의 자신의 순서
        for(int i = p - 1; i < gameCount; i += m){
            answer += game.charAt(i);
        }

        return answer.toUpperCase();
    }
}
