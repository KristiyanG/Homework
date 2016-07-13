import java.util.Scanner;


public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x;
		do{
		System.out.println("Vuvedi chislo ");
	    x=sc.nextInt();
	    }
		while(x<0);
		int sum=0;
//		for(int i=1;i<=x;i++){
//			sum+=i;
//		}
//		System.out.println(sum);
		int y=1;
		while(y<=x){
			sum+=y;
			y++;
		}
		System.out.println(sum);
	
	}

}
