import java.util.Scanner;


public class Example18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a;
		int b;
		do{
			System.out.println("Enter a ");
			a=sc.nextInt();			
		}
		while(a<1||a>9);
		do{
			System.out.println("Enter b");
			b=sc.nextInt();
		}
		while(b<1||b>9);
		for(int i=1;i<=a;i++){
			for(int j=1;j<=b;j++){
				int x=i*j;
				System.out.println(i+"*"+j+"="+x);
			}
		}
		}

}
