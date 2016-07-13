import java.util.Scanner;


public class Example12 {

	public static void main(String[] args) {
		int x;
		Scanner sc=new Scanner(System.in);
		do{
			System.out.println("Enter positive number");
			x=sc.nextInt();
		}
		while(x<0);
		int[] arrayFromMethod=printArray(x);
		
		for (int i = 0; i < arrayFromMethod.length; i++) {
			System.out.print(arrayFromMethod[i]+" ");
		}
		
	}
	static int[] printArray (int x){
		int[] arr=new int[x];
		for (int i = 0; i < arr.length; i++) {
			int j=i+1;
			arr[i]=j;
		}
		return arr ;
		
	}

}
