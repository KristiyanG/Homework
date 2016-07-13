import java.util.Scanner;


public class Example14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner sc=new Scanner (System.in);
		do{
			System.out.println("Vuvedi chislo ");
			 x=sc.nextInt();
			
		}
		while(x<10||x>200);
		for(int i=x;i>=1;i--){
			if(i%7==0){
				System.out.println(i);
			}
			else continue;
		}
	}

}
