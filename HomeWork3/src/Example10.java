import java.util.Scanner;

public class Example10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int a = 0;
		for (int i = 2; i <= x - 1; i++) {
			if (x % i == 0) {
				a++;
				
			}
			else 
				continue;
		}
		if(a>0){
			System.out.println("Chisloto ne e prosto");
		}
		else {
			System.out.println("Chisloto e prosto");
		}

	}
}
