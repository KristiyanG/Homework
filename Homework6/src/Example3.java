public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 3, 4, 8, 9, 6, 3 }, { 55, 88, 77, 64, 24, 11 },
				{ 3, 41, 82, 93, 63, 33 }, { 31, 47, 85, 69, 46, 13 },
				{ 33, 40, 18, 19, 16, 13 } };
		double sum = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				sum += arr[i][j];
				count++;
			}
		}
		double avarage = sum / count;
		System.out.println("The sum is " + sum + " and avarage is =" + avarage);
	}

}
