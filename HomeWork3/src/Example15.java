import java.util.Scanner;


public class Example15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int x;
		Scanner sc=new Scanner(System.in);
		do{
			System.out.println("Vuvedi chislo ..");
			x=sc.nextInt();
	}while(x<0);
		
//		for(int i=1;i<=x;i++){
//			sum+=i;
//			}
//		System.out.println(sum);
//	\
		int y=1;
		do{
			sum+=y;
			y++;
		}while(y<=x);
		System.out.println(sum);
	}
		

}
