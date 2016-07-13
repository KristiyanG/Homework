import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Input String");

		String inputString = sc.nextLine();
		String[] text = inputString.split(" ");
		for (int i = 0; i < text.length; i++) {

			String name = text[i];

			String s1 = name.substring(0, 1).toUpperCase();
			String nameCapitalized = s1 + name.substring(1);
			System.out.print(nameCapitalized + " ");

		}

	}
}
