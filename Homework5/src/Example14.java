import java.util.Scanner;


public class Example14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int y;
		
		do{
		System.out.println("Duljina na masiv 1");
		y=sc.nextInt();
		}
		while(y<0);
		double[] arr=new double[y];
		System.out.println("Vuvedi danni v masiv 1 ");
		for (int i = 0; i < arr.length; i++) {
			double x=sc.nextDouble();
			arr[i]=x;	
		}
		int j=0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>=-2.99&&arr[i]<=2.99){
				
				j++;
			}
		}
		int z=0;
		double[] arr1=new double[j];
		for (int i = 0; i < arr.length; i++) {
				if(arr[i]>=-2.99&&arr[i]<=2.99){
				arr1[z]=arr[i];
				z++;
				}
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		
	}
}
