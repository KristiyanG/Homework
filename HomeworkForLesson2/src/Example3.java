import java.util.Scanner;


public class Example3 {
public static void main(String[] args) {
	Scanner sc= new Scanner (System.in);
	System.out.println("Enter a :");
    int a =sc.nextInt();
    System.out.println("Enter b  :");
    int b=sc.nextInt();
    int x;
    x=a;
    a=b;
    b=x;
    System.out.println("New a = "+ a+ " and new b= "+ b);
    
}
}
