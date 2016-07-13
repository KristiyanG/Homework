import java.util.Scanner;


public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Input String");
		String s1=sc.next();
		System.out.println("Input second String");
		String s2=sc.next();
		for (int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i)==s2.charAt(0)){
			System.out.println(s2);	
			}		
			else {
				System.out.println(s1.charAt(i));
			}
			
		}
		
	}

}
