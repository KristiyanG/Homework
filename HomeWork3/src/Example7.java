import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x;
		do {
			System.out.println("Vuvedi chislo");
			x = sc.nextInt();
		}
		while (x < 0);
		int a = 3;
		// do{System.out.println(a);
		// a+=3;
		// x--;
		// }
		// while(x>=1);
		for (int i = 1; i <= x; i++) {
			System.out.println(a);
			a += 3;
		}

	}

}
