import java.util.Scanner;


public class Example11 {

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
			if(arr[i]%5==0&&arr[i]>5){
				System.out.print(arr[i]+ " ");
			}
		}
		
	}

}
