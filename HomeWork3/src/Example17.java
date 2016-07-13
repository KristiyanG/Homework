import java.util.Scanner;


public class Example17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int rows;
		char symbol;
		do{
			System.out.println("Enter number ");
			rows=sc.nextInt();
		}
		while(rows<3||rows>20);
		System.out.println("Enter symbol ");
		symbol= sc.next().charAt(0);
		for(int y=1;y<=rows;y++){
			System.out.print("*");
		}
		System.out.println();
		for(int i=1;i<=rows-2;i++){
		System.out.print("*");
		for(int j=1;j<=rows-2;j++){
			System.out.print(symbol);
		}
		System.out.println("*");
		}
		
		for(int x=1;x<=rows;x++){
			System.out.print("*");
		}
	}

}
