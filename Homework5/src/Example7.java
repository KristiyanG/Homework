import java.util.Scanner;


public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int y;
		
		do{
		System.out.println("Duljina na masiv 1");
		y=sc.nextInt();
		}
		while(y<0);
		int[] arr=new int[y];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Vuvedi danni v masiv 1 ");
			int x=sc.nextInt();
			arr[i]=x;	
		}
		int arr1[]=new int[y];
		arr1[0]=arr[0];
		arr1[y-1]=arr[y-1];
		for (int i = 1; i < arr1.length-1; i++) {
			arr1[i]=arr[i-1]+arr[i+1];
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]+" ");
		}
		
	}

}
