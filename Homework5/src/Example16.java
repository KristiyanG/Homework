import java.util.Scanner;

public class Example16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		double y;
		double[] arr=new double[10];
		for (int i = 0; i < arr.length; i++) {
			y=sc.nextDouble();
			arr[i]=y;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Repeat numbers");
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(i==j){
					continue;
				}
				else if(arr[i]==arr[j]){
					System.out.print(arr[i]+" ");

				}
			}
				
			}
			System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<-0.231){
				arr[i]=(i+1)*(i+1)+41.25;
			}
			else {
				arr[i]=arr[i]*(i+1);
			}
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
