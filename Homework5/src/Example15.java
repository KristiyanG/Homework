import java.util.Scanner;

public class Example15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = 0;
		do {
			System.out.println("Input size larger than three:");
			n = sc.nextInt();
		} while (n < 4);

		// create array and fill with numbers
		double[] arr = new double[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Input number on position " + (i + 1) + ":");
			arr[i] = sc.nextDouble();
		}
		double max1 = 0;
		double max2 = 0;
		double max3 = 0;
		int position1 = 0;
		int position2 = 0;
		int position3 = 0;
		boolean isPositive1=true;
		boolean isPositive2=true;
		boolean isPositive3=true;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<0){
				arr[i]*=-1;
				isPositive1=false;
			}
			if(arr[i]>max1){
				max1=arr[i];
				position1=i;
			}
			
		}
		
		arr[position1]=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<0){
				arr[i]*=-1;
				isPositive2=false;
			}
			if(arr[i]>max2){
				max2=arr[i];
				position1=i;
			}
			
		}
		
		arr[position1]=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<0){
				arr[i]*=-1;
				isPositive3=false;
			}
			if(arr[i]>max3){
				max3=arr[i];
				position1=i;
			}
			
		}
		
		arr[position1]=0;
		System.out.println((isPositive1?max1*-1:max1)+" "+(isPositive2?max2:max2*-1)+" "+(isPositive3?max3:max3*-1));

	}
}