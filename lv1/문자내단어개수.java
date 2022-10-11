class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        int cntP = 0;
        int cntY = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p') cntP++;
            if (s.charAt(i) == 'y') cntY++;
        }
        
        return cntP == cntY ? true : false;
        

    }
}