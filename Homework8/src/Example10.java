import java.util.Scanner;


public class Example10 {

	public static void main(String[] args) {
		
		System.out.println("Vuvedi dyma");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		for (int i = 0; i < s.length(); i++) {
			char newLetter=(char)(s.charAt(i)+5);
			System.out.print(newLetter);
		}
		System.out.println();
		

	}

}
