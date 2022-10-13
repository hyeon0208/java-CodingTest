import java.util.Scanner;

public class FlowEx5 {
    public static void main(String[] args) {
    int score = 0; // 점수를 저장하기 위한 변수
    char grade = ' ', opt = ' '; // 학점을 저장하기 위한 변수
    
    System.out.print("점수를 입력하세요. : ");
    Scanner scanner = new Scanner(System.in);
    score = scanner.nextInt(); // 화면을 통해 입력받은 숫자를 score에 저장
    
    if (score >= 90) {
        grade = 'A';
        if (score >= 98) {
            opt = '+';
        } else if (score < 94) {
            opt = '-';
        }
    } else if (score >= 80) {
        grade = 'B';
        if (score >= 88) {
            opt = '+';
        } else if (score < 84) {
            opt = '-';
        }
    } else if (score >= 70) {
        grade = 'C';
        if (score >= 78) {
            opt = '+';
        } else if (score < 74) {
            opt = '-';
        }
    } else {
        grade = 'D';
    }
    System.out.printf("당신의 학점은 %c%c입니다.", grade, opt);
}

}