package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class greedy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("물건의 가격을 입력 해주세요. : ");
        int price = input.nextInt();
        input.nextLine();

        System.out.println("지불할 금액을 입력해 주세요. : ");
        int giveMoney = input.nextInt();

        int changeMoney = price - giveMoney;
        exchangeCount(changeMoney);
    }

    private static int exchangeCount(int changeMoney) {
        int[] coin = new int[] {500, 100, 50, 10};
        List<Integer> coinArr = new ArrayList<>();
        int count = 0;

        System.out.println("거스름돈 : " + changeMoney);

        for (int i : coin) {
            count += changeMoney / i;
            coinArr.add(changeMoney / i);
            changeMoney %= i;
        }
        System.out.println("받은 동전 개수 배열 : " + coinArr);
        System.out.println("총 동전 개수 : " + count);
        return count;
    }
}
