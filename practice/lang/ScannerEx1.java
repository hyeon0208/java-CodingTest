package lang;

import java.util.Scanner;

class ScannerEx1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("a값을 입력해주세요.");
            int a = input.nextInt();

            System.out.println("b값을 입력해주세요.");
            int b = input.nextInt();

            System.out.println("두 값의 합: " + (a + b));
        } while (input.hasNextInt());
    }
}