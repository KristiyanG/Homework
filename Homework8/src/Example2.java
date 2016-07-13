import java.awt.image.ReplicateScaleFilter;
import java.util.Scanner;


public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1;
		String s2;
		do{
		s1=sc.next();
		
		}
		while(s1.length()>20);
		
		do{
			s2=sc.next();
			
			}
			while(s2.length()>20);
		
		String a=s1;
		String b=s2;
		s1=s1.replace(s1.substring(0,5), s2.substring(0,5));
		s2=s2.replace(b.substring(0,5), a.substring(0,5));
		
		int result=s1.compareTo(s2);
		
		String longestString;
		if(result>0){
			longestString=s2;
		}
		else {
			longestString	=s1;
		}
		System.out.println(longestString.length());		
		System.out.println(longestString);
	}

}
