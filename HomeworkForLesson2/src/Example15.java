import java.util.Scanner;


public class Example15 {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	System.out.println(" Vuvedete chas v intervala ot [0;24] : ");
	int x=sc.nextInt();
	if(x<0||x>24){
		System.out.println("Chasut  ne e v intervala !");
	}	
	else {
		if(x>4&&x<=9){
			System.out.println("Dobro ytro !");
		}
		else if(x>9&&x<=18){
			System.out.println("Dobur den !");
		}
		else if((x>18&&x<=24)||(x>0&&x<=4)){
			System.out.println("Dobur vecher !");
		}
	
	}
	
	}
}
