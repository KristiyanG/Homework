import java.util.Scanner;


public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x;
		System.out.println("Duljina na masiva");
		int y=sc.nextInt();
		int[] arr=new int[y];
		boolean ogledalen =true;
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Vuvedi danni v kletkata ");
			x=sc.nextInt();
			arr[i]=x;
			
		}
		for (int i = 0; i < arr.length/2; i++) {
			if(arr[i]!=arr[arr.length-1-i]){
				ogledalen=false;
			}
		}
		System.out.println(ogledalen?"Masiva e ogledalen":"Masiva ne e ogledalen");
	}

}
