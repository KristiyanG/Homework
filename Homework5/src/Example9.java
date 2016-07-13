import java.util.Scanner;


public class Example9 {
	public static void main(String[] args) {
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
		int[] arr1=new int[y];
	for (int i = 0; i < arr.length; i++) {
		arr1[i]=arr[arr.length-1-i];
		}
		for (int i = 0; i < arr.length/2; i++) {
			int x=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=x;
	
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]);
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
}
}
