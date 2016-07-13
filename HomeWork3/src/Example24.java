import java.util.Scanner;

public class Example24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		do{
			System.out.println("Vuvedi chislo :");
			number=sc.nextInt();
		}
		while(number<10||number>30000);
		int palidrom = number;
		int novoChislo = 0;
		
		do {
			int ostatyk = palidrom % 10;
			novoChislo = novoChislo * 10 + ostatyk;
			palidrom = palidrom / 10;
		} while (palidrom != 0);

		if (number == novoChislo) {
			System.out.println(number +" e palidrom");
		} else {
			System.out.println(number +" ne e palidrom ");
		}
	System.out.println(2/4);


	}
}