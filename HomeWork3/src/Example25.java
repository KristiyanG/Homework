import java.util.Scanner;


public class Example25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		do{
			System.out.println("Vuvedi N");
			n=sc.nextInt();
		}
		while(n<0);
		int x=1;
		int y=1;
		do{
			y*=x;
			x++;
		}while(x<=n);
		System.out.println(y);
	}

}
