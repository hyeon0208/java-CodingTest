class 소수찾기 {
    public int solution(int n) {
        int answer = 0;
        // 0 ~ n 까지의 수를 가지는 배열 생성
        int[] arr = new int[n + 1];
        /*
        소수 중 제일 작은 수는 2이므로 2부터 시작한다.
        n의 모든 약수에 해당하는 a와 b가 어떠한 약수이더라도
        둘 중 하나는 무조건 m(=sqrt(n)) 이하 이므로, m까지만 조사한다면 n이 소수인지 알 수 있다.
        */
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (arr[i] == 1) {
                continue;
            }
            /*
            i의 배수를 체크하는데 j = i + i 인 이유는
            2 는 소수지만 i가 2 부터 시작하기 때문에 2 가 포함되지 않게 하기 위해서이다.
            j = j + i로 하여 i의 배수를 체크한다.
            */
            for (int j = i + i; j <= n; j += i) {
                arr[j] = 1;
            }
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] != 1) {
                answer++;
            }
        }
        return answer;
    }
}