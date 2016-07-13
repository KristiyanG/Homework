public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 3, 4, 8, 9, 6, 3 }, { 55, 88, 77, 64, 24, 11 },
				{ 3, 41, 82, 93, 63, 34 }, { 31, 47, 85, 69, 46, 13 },
				{ 33, 40, 18, 19, 16, 13 } };
		int min = arr[0][0];
		int max = arr[0][0];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
				}
				if (arr[i][j] < min) {
					min = arr[i][j];

				}
			}
		}
		System.out.println("Min element is " + min + " and max element is "
				+ max);

	}

}
