class 최소직사각형 {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeigth = 0;

        for (int i = 0; i < sizes.length; i++) {
            int width = Math.max(sizes[i][0], sizes[i][1]);
            int heigth = Math.min(sizes[i][0], sizes[i][1]);

            maxWidth = Math.max(maxWidth, width);
            maxHeigth = Math.max(maxHeigth ,heigth);
        }
        return maxWidth * maxHeigth;
    }
}

/*
  class Solution {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeigth = 0;

        for (int i = 0; i < sizes.length; i++) {
            int width = Math.max(sizes[i][0], sizes[i][1]);
            int heigth = 0;
            if (sizes[i][0] < sizes[i][1]) {
                heigth = sizes[i][0];
            } else {
                heigth = sizes[i][1];
            }

            maxWidth = Math.max(maxWidth, width);
            maxHeigth = Math.max(maxHeigth, heigth);
        }
        return maxWidth * maxHeigth;
    }
}
*/