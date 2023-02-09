package highscorekit.bruteforce;

import java.util.Arrays;
import javax.swing.plaf.synth.SynthUI;

public class 최소직사각형 {
    public static void main(String[] args) {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(solution(sizes));
    }

    public static int solution(int[][] sizes) {
        int answer = 0;
        int wMax = 0;
        int hMax = 0;

        for (int i = 0; i < sizes.length; i++) {
            int width = Math.max(sizes[i][0], sizes[i][1]);
            if (sizes[i][0] < sizes[i][1]) {
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = width;
            }

            wMax = Math.max(wMax, sizes[i][0]);
            hMax = Math.max(hMax, sizes[i][1]);
        }
        answer = wMax * hMax;

        return answer;
    }
}
