public class 구구단 {

	public static void main(String[] args) {
		// 2 3 4 단 출력
				int number[] = {2, 3, 4};
				for (int i = 0; i < number.length; i++) {
					for (int j = 1; j < 10; j++) {
						System.out.printf("%d * %d = %d\n", number[i], j, (number[i] * j));
					}
				}
			}

}
