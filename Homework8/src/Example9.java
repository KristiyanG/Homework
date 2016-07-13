import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s;

		boolean isValidate;
		do {
			System.out.println("Input String");
			s = sc.next();
			s = s.trim();

			if (s.matches("[a-zA-Z0-9-]*")) {
				isValidate = true;
			} else {
				isValidate = false;
			}
		} while (!isValidate);

		int sum = 0;

		s = s.replaceAll("-?[A-Z,a-z]", " ");

		String[] arr = s.split(" ");

		for (int i = 0; i < arr.length; i++) {
			if (!arr[i].isEmpty() && !arr[i].equals(" ")) {

				if (arr[i].indexOf("-") > 1) {
					String s1 = arr[i].substring(0, arr[i].indexOf("-"));
					System.out.println(s1);
					sum += Integer.parseInt(s1);
					String s2 = arr[i].substring(arr[i].indexOf("-"),
							arr[i].length());
					System.out.println(s2);
					sum += Integer.parseInt(s2);

				}

				else {
					System.out.println(arr[i]);
					int x = Integer.parseInt(arr[i]);
					sum += x;
				}
			}
		}
		System.out.println("The sum is " + sum);

	}

}
