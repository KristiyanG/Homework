import java.util.Scanner;


public class Example9 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a :");
	int a=sc.nextInt();
	if(a>=10&&a<=99){
    System.out.println("Enter b : ");
   
    int b=sc.nextInt();
    if(b>=10&&b<=99){
    int c=a*b;
    int y=c%10;
    
    if(y%2==0){
    	System.out.println(c + " ,  Cifrata "+ y + " e chetno");
    }
    else System.out.println(c +" , Cifrata "+ y + " e nechetno");
    
    }
    else System.out.println("Cifrata "+ b+ "Ne e v intervala");
    }
	else{System.out.println("Cifrata "+ a+ "Ne e v intervala");
		}
	}}

