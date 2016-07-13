import java.util.Scanner;


public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		int x=s1.length();
		int y=s2.length();
		if(x==y){

			for (int i = 0; i < s1.length(); i++) {
				if(s1.charAt(i)==s2.charAt(i)){
					continue;
				}
				else{
					System.out.println((i+1)+" "+s1.charAt(i)+"-"+s2.charAt(i));
				}
			}
		}
		else{
			System.out.println("Dvata stringa sa s razlichna duljina");
		}
		
	
	}

}
