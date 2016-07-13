import java.util.Scanner;


public class Example11 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Vuvedete chislo : ");
	
	int x=sc.nextInt();
	if(x<99||x>1000){
		System.out.println("Chisloto ne e tricifreno");
	}
	else {
	int a=x/100;
	int b=x%100/10;
	int c=x%10;
	System.out.println(a+" "  + b+"  " +c);
	if(a==0||b==0||c==0){
	System.out.println("Chisloto s1durja nula !!!");}
	else {if(x%a==0 && x%b==0  && x%c==0){
		System.out.println("Chisloto se deli na svoite cifri .");
	}
	else System.out.println("Chisloto ne se deli na svoite cifri ");

	}
}}
}
