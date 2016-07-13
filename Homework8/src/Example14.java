import java.util.Scanner;


public class Example14 {

	public static void main(String[] args) {
		int x;
		Scanner sc=new Scanner(System.in);
		do{
			System.out.println("Enter number");
			x=sc.nextInt();
		}
		while(x<1);
		int factoriel=factoriel(x);
		System.out.println(x+"! ="+factoriel);
	}
	static int factoriel(int x){
		int factoriel=1;
		for (int i = 1; i <= x; i++) {
			factoriel*=i;
		}
		return factoriel;
	}
}
