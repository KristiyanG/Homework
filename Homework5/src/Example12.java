import java.util.Scanner;


public class Example12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Vuvedi danni v masiva ");
		int[] arr=new int[7];
		for (int i = 0; i < arr.length; i++) {
			
			int x=sc.nextInt();
			arr[i]=x;	
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		int x=arr[0];
		arr[0]=arr[1];
		arr[1]=x;
		arr[2]=arr[2]+arr[3];
		arr[3]=arr[2]-arr[3];
		arr[2]=arr[2]-arr[3];
		arr[4]=arr[4]*arr[5];
		arr[5]=arr[4]/arr[5];
		arr[4]=arr[4]/arr[5];
		
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
