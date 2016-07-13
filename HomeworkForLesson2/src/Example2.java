import java.util.Scanner;


public class Example2 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a :");
	    int a =sc.nextInt();
	    System.out.println("Enter b  :");
	    int b=sc.nextInt();
	    
	    int sum=a+b;
	    int mul=a*b;
	    int dev=a/b;
	    int mod=a%b;
	    
	    System.out.println("a + b = "+ sum);
	    System.out.println("a*b = "+ mul);
	    System.out.println("a/b= "+ dev);
	    System.out.println("a%b= "+ mod);
	    
	    
	}

}
