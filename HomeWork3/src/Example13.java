import java.util.Scanner;


public class Example13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum;
		Scanner sc=new Scanner(System.in);
		do{ System.out.println("Vuvedi chislo ...");
			sum=sc.nextInt();
			
		}while(sum<2||sum>27);
		for (int i=100;i<=999;i++){
			int a=i/100;
			int b=i%100/10;
			int c=i%10;
			if((a+b+c)!=sum){
				continue;
			}
			else {
				System.out.println(i);
			}
		}
	}

}
