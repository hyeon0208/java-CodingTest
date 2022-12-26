class 문자내단어개수 {
    boolean solution(String s) {
        s = s.toLowerCase();
        int cntP = 0;
        int cntY = 0;
        for (int i = 0; i < s.length(); i++) {
                // charAt 으로 문자열 i번째 문자를 가져온다.
            if (s.charAt(i) == 'p') cntP++;
            if (s.charAt(i) == 'y') cntY++;
        }
        
        return cntP == cntY ? true : false;
        

    }
}