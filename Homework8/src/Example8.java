import java.util.Scanner;


public class Example8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Input String");
		String s=sc.nextLine();
		
		boolean isPalidrome=true;
		for (int i = 0; i < s.length()/2; i++) {
			if(s.charAt(i)==s.charAt(s.length()-1-i)){
				
				continue;
			}
			else{
				isPalidrome=false;
				break;
			}
		}
		System.out.println(isPalidrome? "Dymata e palidrom ":"Dymata ne e palidrom");
	}

	

}
