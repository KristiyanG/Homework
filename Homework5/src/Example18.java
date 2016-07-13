import java.util.Scanner;


public class Example18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int y;
		
		do{
		System.out.println("Duljina na masiv 1");
		y=sc.nextInt();
		}
		while(y<0);
		int[] arr1=new int[y];
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Vuvedi danni v masiv 1 ");
			int x=sc.nextInt();
			arr1[i]=x;
			
		}
		
		int z;
		
		do{
		System.out.println("Duljina na masiv 2");
		y=sc.nextInt();
		}
		while(y<0);
		int[] arr2=new int[y];
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("Vuvedi danni v masiv 2 ");
			int x=sc.nextInt();
			arr2[i]=x;
			
		}
		if(arr1.length!=arr2.length){
			System.out.println("Masivite ne sa s ednakva duljina");
		}
		else{
		int[] arr3=new int[arr1.length];
		for (int i = 0; i < arr2.length; i++) {
			if(arr1[i]>arr2[i]){
				arr3[i]=arr1[i];
			}
			else{
				arr3[i]=arr2[i];
			}
		}
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i]+", ");
		}
		}
	}

}
