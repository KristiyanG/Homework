import java.util.Scanner;


public class Example8 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println(" Vuvedete x [1000;9999]...");
	int x=sc.nextInt();
	if(x>=1000&&x<=9999){
		int a1=x/1000;
		int a2=x%1000/100;
		int a3=x%100/10;
		int a4=x%10;
		int b=a1*10+a4;
		int c=a2*10+a3;
		
		if(b>c){
			System.out.println(b+ ">" +c);
		}
		else if(b<c)System.out.println(c+ " > "+ b);
		else System.out.println(c+"= "+b);
    
	}
	else System.out.println("Chisloto "+ x+ " ne e v intervala");
}
}
