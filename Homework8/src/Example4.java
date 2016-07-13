import java.util.Scanner;


public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Input String");
		String name1=sc.nextLine();
		
		String[] s=name1.split(",");
		int result1=0;
		char[] arr1=new char[s[0].length()];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]=(char)(s[0].charAt(i));
		}
		for (int i = 0; i < arr1.length; i++) {
			result1+=arr1[i];
		}
		
		int result2=0;
		char[] arr2=new char[s[1].length()];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i]=(char)(s[1].charAt(i));
		}
		for (int i = 0; i < arr2.length; i++) {
			result2+=arr2[i];
		}
		
		if (result1>result2){
			System.out.println(s[0]);
		}
		else if(result1<result2){
			System.out.println(s[1]);
		}

		
	}

}
