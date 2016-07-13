import java.util.Scanner;

public class Example6 {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a1 :");
	    int a1 =sc.nextInt();
	    System.out.println("Enter a2  :");
	    int a2=sc.nextInt();
	    System.out.println("Enter a3 : ");
	    int a3=sc.nextInt();
	    int x;
	    x=a1;
	    a1=a2;
	    a2=a3;
	    a3=x;
	    System.out.println(a1);
	    System.out.println(a2);
	    System.out.println(a3);
	  
	}
}
