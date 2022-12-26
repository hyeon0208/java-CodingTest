class jadencase문자열 {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.toLowerCase().split("");
        boolean space = true;

        for (String str : arr) {
            if (space) {
                answer += str.toUpperCase();
            }

            if (!space) {
                answer += str;
            }

            if (str.equals(" ")) {
                space = true;
            }

            if (!str.equals(" ")) {
                space = false;
            }
        }
        return answer;
    }
}