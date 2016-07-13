import java.util.Scanner;


public class Example5 {
public static void main(String[] args) {
	Scanner sc= new Scanner (System.in);
	System.out.println("Enter a :");
    int a =sc.nextInt();
    System.out.println("Enter b  :");
    int b=sc.nextInt();
    System.out.println("Enter c : ");
    int c=sc.nextInt();
    if((a>=c)&&(b<=c)){
    	System.out.println(a +" "+ c + " "+ b);
    }
    else if(a<=b&&b<=c){
    System.out.println(c +" "+ b +" "+ a);
    }
    else if(a>=c&&a<=b){
    	System.out.println(b+" "+ a +" "+c );
    	
    }else if(a<=c&&c<=b){
    	System.out.println(b+" "+ c +" "+a );
    }
    else if((b>=c)&&a>=b){
    	System.out.println(a+" "+ b +" "+c );
    }
    else if((b>=a)&&(a<=c)){
    	System.out.println(c+" "+ a +" "+b);
    }
    
}
}
