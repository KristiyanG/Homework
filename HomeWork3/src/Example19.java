import java.util.Scanner;


public class Example19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner sc=new Scanner(System.in);
		do{
			System.out.println("Enter x [10..99]");
			x=sc.nextInt();
		}
		while(x<10||x>99);
		do{
			if(x%2==0){
			x=x/2;
			System.out.println(x);
			}
			else {
				x=x*3+1;
				System.out.println(x);
			}
		}
		while(x!=1);
	}

}
