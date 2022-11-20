package 배열;
class MultiArrEx3 {
	public static void main(String[] args) {
		int[][] m1 = {
			{1, 2, 3},
			{4, 5, 6}
		};

		int[][] m2 = {
			{1, 2},
			{3, 4},
			{5, 6}
		};

		// 행렬 곱셈이 가능하려면, 배열 m1의 열의 길이와 배열 m2의 행의 길이가 일치해야한다.
		final int ROW    = m1.length;      // m1의 행길이 (m3의 행 길이)
		final int M2_COL    = m2[0].length;  // m2의 열길이(m3의 열 길이)
		final int M2_ROW = m2.length;	    // m2의 행길이

		int[][] m3 = new int[ROW][M2_COL];

	   // 행렬곱 m1 x m2의 결과를 m3에 저장
		for(int i=0;i<ROW;i++)
			for(int j=0;j<M2_COL;j++)
				for(int k=0;k<M2_ROW;k++)
					m3[i][j] += m1[i][k] * m2[k][j]; 

	   // 행렬 m3를 출력 
		for(int i=0;i<ROW;i++) {
			for(int j=0;j<M2_COL;j++) {
				System.out.printf("%3d ", m3[i][j]);
			}
			System.out.println();
		}
	} 
}