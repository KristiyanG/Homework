import java.util.Scanner;


public class Example1 {
public static void main(String[] args) {
	Scanner sc= new Scanner (System.in);
	System.out.println("Enter a :");
    int a =sc.nextInt();
    System.out.println("Enter b  :");
    int b=sc.nextInt();
    System.out.println("Enter c : ");
    int c=sc.nextInt();
    if((a>c&&b<c)||(a<c&&b>c)){
    	System.out.println("Chisloto "+c + " e mejdy "+ a +  " i " +b);
    	
    }
    else System.out.println("Chisloto " + " Ne  e mejdy "+ a +  " i " +b);

}
}
