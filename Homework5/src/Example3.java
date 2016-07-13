import java.util.Scanner;


public class Example3 {
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int[] arr=new int[10];
		arr[0]=x;
		arr[1]=x;
		for (int i = 2; i < arr.length; i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
}
}
