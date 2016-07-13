import java.util.Scanner;


public class Example13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x;
		do{
		 x=sc.nextInt();
		}
		while(x<0);
		int temp=x;
		int y=x;
		int z=0;
		do{	

		y=x/2;
		x=x/2;
			z++;
		}
		while(y!=0);
		int[] arr=new int[z];
		for (int i = 0; i < arr.length; i++) {
				
				arr[i]=temp%2;
		
				temp=temp/2;
				
		}
		for (int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
	}
}
