import java.util.Scanner;


public class Example16 {
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
	System.out.println(x);
	if(a==b&&b==c){
		System.out.println("Cifrite sa ravni!");
		
	}
	else if(a>b&&b>c){
		System.out.println("Cifrite sa vvv v1zhodqsht red !");
	}
	else if(a<b&&b<c){
		System.out.println("Cifrite sa vuv nizhodqsht red !");
	}
	else{
		System.out.println("Cifrite sa nenaredeni za opisanite sluchai !");
	}
}
}}
