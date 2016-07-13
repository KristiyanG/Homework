import java.util.Scanner;


public class Example16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n;
		int m;
		do{
			System.out.println("Enter n ");
			n=sc.nextInt();
		}
		while(n<10||n>5555);
		do{
			System.out.println("Enter m ");
			m=sc.nextInt();
		}
		while(m<10||m>5555);
		int min=m;
		int max=n;
		if(n<m){
			min=n;
			max=m;
			}
		
		if(n<=m){
			for(int i=max;i>=min;i--){
				if(i%50==0){
					System.out.println(i);
				}
				else 
					continue;
			}
		}
		
	}

}
