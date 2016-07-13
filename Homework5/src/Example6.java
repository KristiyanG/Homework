import java.util.Scanner;


public class Example6 {

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
		
		int z;
		
		do{
		System.out.println("Duljina na masiv 2");
		y=sc.nextInt();
		}
		while(y<0);
		int[] arr1=new int[y];
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("Vuvedi danni v masiv 2 ");
			int x=sc.nextInt();
			arr1[i]=x;
			
		}
		boolean ednakvi =true;
		if(arr.length!=arr1.length){
			System.out.println("Masivite sa s razlichni razmeri !");
		}
		else{
			for (int i = 0; i < arr1.length; i++) {
				if(arr[i]!=arr1[i]){
					ednakvi=false;
				}
			}
		}
		System.out.println(ednakvi?"Masivite sa ednakvi":"Masivite sa razlichni");
	}

}
