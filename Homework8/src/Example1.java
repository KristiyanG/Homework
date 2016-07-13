import java.util.Scanner;


public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1;
		String s2;
		do{
		s1=sc.next();
		
		}
		while(s1.length()>40);
		
		do{
			s2=sc.next();
			
			}
			while(s2.length()>40);
		
		
		System.out.println(s1.toUpperCase()+" "+s1.toLowerCase()+" "+s2.toUpperCase()+" "+s2.toLowerCase());
	}

}
