import java.util.Scanner;


public class Example4 {
public static void main(String[] args) {
	Scanner sc= new Scanner (System.in);
	System.out.println("Enter a :");
    int a =sc.nextInt();
    System.out.println("Enter b  :");
    int b=sc.nextInt();
    if(a>b){
    	System.out.println(b+ "  "+ a);
    }
    else if(b>a){
    	System.out.println(a+ " "+ b);
    }
    
}
}
