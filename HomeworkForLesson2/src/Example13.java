import java.util.Scanner;


public class Example13 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println(" Vuvedete temperatyra : ");
	int x=sc.nextInt();
	if(x<-100||x>100){
		System.out.println("Temperatyrata ne e v intervala !");
		
	}
	else {
		if(x<-20&&x>=-100){
			System.out.println("Ledeno studeno. ");
		}
		else if(x>-20&&x<=0){
			System.out.println("Studeno.");
			
		}
		else if(x>0&&x<=15){
			System.out.println("Hladno.");
			
		}
		else if(x>15&&x<=25){
			System.out.println("Toplo.");
		}
		else if(x>25&&x<=100)
			System.out.println("Goreshto.");
		}
	}
	
}

