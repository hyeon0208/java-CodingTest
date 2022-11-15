class Solution {
    public int solution(String s) {
        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        int answer = Integer.parseInt(s);

        for(int i=0; i<10; i++){
            s = s.replace(num[i], Integer.toString(i));
        }

        return answer;
    }
}