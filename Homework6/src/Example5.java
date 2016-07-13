public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },
				{ 13, 14, 15, 16 } };

		int sumRow = 0;
		int sumCow = 0;
		int tempsumCow = 0;
		int tempsumRow = 0;
		for (int i = 0; i < arr.length; i++) {
			tempsumRow = 0;
			tempsumCow = 0;
			for (int j = 0; j < arr.length; j++) {

				tempsumRow += arr[i][j];

				tempsumCow += arr[j][i];

			}
			if (sumRow < tempsumRow) {
				sumRow = tempsumRow;
			}
			if (sumCow < tempsumCow) {
				sumCow = tempsumCow;
			}

		}

		System.out.println(sumRow + " " + sumCow);
		System.out
				.println(sumCow > sumRow ? "Sumata na kolonite > sumata na redove"
						: "Sumata na redove > sumata na koloni");
	}

}
