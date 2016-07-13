import java.util.Scanner;


public class Example8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int sum=x;
		for(int i=1;i<=x;i++){
			for(int j=1;j<=x;j++){
				 
				System.out.print(sum-1);	
				
			}
			System.out.println();
			sum+=2;
		}
		
		}
}
