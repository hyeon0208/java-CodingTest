class 부족한금액계산 {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;
        for(int i = 1; i <= count; i++) {
            sum += price * i; 
        }
        answer = money - sum;
        
        return answer > 0 ? 0 : (long)Math.abs(answer);
    }
}