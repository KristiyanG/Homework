import java.util.Scanner;


public class Example10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int[] arr=new int[7];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Vuvedi danni v masiv 1 ");
			int x=sc.nextInt();
			arr[i]=x;	
		}
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
		}
	
		double avarage=sum/arr.length;
		double[] arr1=new double[arr.length];
		for (int i = 0; i < arr1.length; i++){
			double a=avarage-arr[i];	
			double b=a>0?a:0-a;
			arr1[i]=b;
		}
		
		double minEl = arr1[0];
		int minIndex = 0;
		for(int i = 1; i < arr1.length; i++) {
		if(minEl > arr1[i]) {
		minEl = arr1[i];
		minIndex = i;
		}
		}
		System.out.println(arr[minIndex]);
	
	}
}
