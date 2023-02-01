package algorithm;

import java.util.Arrays;

public class LineSweeping {
    public static void main(String[] args) {
        int n = 4;
        int[][] lines = new int[][]{{1, 3}, {2, 5}, {3, 5}, {6, 7}};
        System.out.println(getLineLength(n, lines));
    }

    public static int getLineLength(int n, int[][] lines) {
        // x좌표가 서로 같으면 y좌표 오름차순 정렬, 서로 다르면 x좌표 오름차순 정렬.
        Arrays.sort(lines, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o1[1] - o2[1];
            } else {
                return o1[0] - o2[0];
            }
        });

        int prevX = lines[0][0]; // 이전 선의 x좌표
        int prevY = lines[0][1]; // 이전 선의 y좌표
        int len = prevY - prevX; // 현재 선의 길이

        for (int i = 1; i < n; i++) {
            int currentX = lines[i][0]; // 현재 선의 x좌표
            int currentY = lines[i][1]; // 현재 선의 y좌표

            /*
            현재 선의 x가 이전 선의 x보다 크거나 같고,현재 선의 y가 이전 선의 y보다 크거나 작다면
            현재 선이 이전 선에 포함되므로 다음 선으로 넘어간다.
             */
            if (prevX <= currentX && currentY <= prevY) {
                continue;
            }
            // 현재 선이 이전 선에 포함된다면, 두 선을 이어 붙인다.
            if (currentX < prevY) {
                len += currentY - prevY;
            }
            // 현재 선이 이전 선과 겹치지 않는다면, 겹치지 않는 선의 길이를 더한다.
            if (currentX > prevY){
                len += currentY - currentX;
            }
            // 이전 선을 현재 선으로 변경한다.
            prevX = currentX;
            prevY = currentY;
        }

        return len;
    }
}