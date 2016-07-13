import java.util.Scanner;

public class Example5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a");
		int a = sc.nextInt();
		System.out.println("Enter b");
		int b = sc.nextInt();
		int min = a;
		int max = b;
		if (a > b) {
			min = b;
			max = a;
		}

		for (int i = min; i <= max; i++) {
			System.out.println(i);

		}
	}
}
