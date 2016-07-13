import java.util.Scanner;

public class Example12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedete den ...");
		int den = sc.nextInt();
		System.out.println("Vuvedete mesec ...");
		int mesec = sc.nextInt();
		System.out.println("Vuvedete godina ...");
		int godina = sc.nextInt();
		boolean visokosna = (godina % 4 == 0 && (godina % 400 == 0 || godina % 100 != 0));
		boolean validnaData = true;
		if (den < 1 || den > 31)
			validnaData = false;
		else if (mesec < 1 || mesec > 12)
			validnaData = false;
		else if (godina < 0)
			validnaData = false;
		else if (mesec == 2 && den == 29 && !visokosna)
			validnaData = false;
		if (den == 28 && mesec == 2) {
			if (visokosna)
				den++;
			else
				den = 1;
			mesec++;
		} 
		else if (den == 29 && mesec == 2 && visokosna) {
			den = 1;
			mesec++;
		} 
		else if (den == 30) {
			if (mesec == 1 || mesec == 3 || mesec == 5 || mesec == 7
					|| mesec == 8 || mesec == 10 || mesec == 12) {
				den++;
			} 
			else if (mesec == 2)
				validnaData = false;
			else {
				den = 1;
				mesec++;
			}}
	   else if (den == 31) {
				if (mesec == 2 || mesec == 4 || mesec == 6 || mesec == 9
						|| mesec == 11)
					validnaData = false;

				else if (mesec == 1 || mesec == 3 || mesec == 5 || mesec == 7
						|| mesec == 8 || mesec == 10) {
					den = 1;
					mesec++;
				}
					else if (mesec == 12) {
						den=1;

						mesec = 1;
						godina++;
					}
					}
				
			 else
				den++;
		
		if (validnaData) {
			System.out.println("Sledvashtata data e : " + den + ": " + mesec
					+ ": " + godina);
		} else
			System.out.println("Nevalidna data !");

	}
}
