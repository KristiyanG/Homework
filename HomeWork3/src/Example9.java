import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum = 0;
		int b = sc.nextInt();
		int min = b;
		int max = a;
		if (a < b) {
			min = a;
			max = b;
		}

		for (int i = min; i <= max; i++) {
			if (i % 3 == 0) {
				System.out.print("Skip 3 , ");
				continue;
			}
			System.out.print(i * i + ", ");
			sum += i;
			if (sum > 200) {
				break;
			}

		}
	}

}
