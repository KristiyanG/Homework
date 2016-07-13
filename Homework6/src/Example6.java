public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 11, 12, 13, 14, 15, 16 }, { 21, 22, 23, 24, 25, 26 },
				{ 31, 32, 33, 34, 35, 36 }, { 41, 42, 43, 44, 45, 46 },
				{ 51, 52, 53, 54, 55, 56 }, { 61, 62, 63, 64, 65, 66 } };
		int obshtaSuma = 0;
		for (int i = 1; i < arr.length; i += 2) {
			int sum = 0;
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + ", ");
				sum += arr[i][j];
			}
			obshtaSuma += sum;
			System.out.println("Sumata e " + sum);
		}
		System.out.println("Obshta suma " + obshtaSuma);

	}

}
