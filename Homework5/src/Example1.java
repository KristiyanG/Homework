import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int y;

		do {
			System.out.println("Duljina na masiv 1");
			y = sc.nextInt();
		} while (y < 0);
		int[] arr = new int[y];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Vuvedi danni v masiv 1 ");
			int x = sc.nextInt();
			arr[i] = x;
		}
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i] && arr[i] % 3 == 0) {
				min = arr[i];
			} else
				continue;
		}
		System.out.println(min);

	}

}
