import java.util.Scanner;


public class Example7 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);

		System.out.println("Input String");

		String s = sc.nextLine();
		String[] word=s.split(" ");
		int broiDymi=word.length;
		int naiDulgaDuma=0;
		for (int i = 0; i < word.length; i++) {
			
			if(word[i].length()>naiDulgaDuma){
				naiDulgaDuma=word[i].length();
			}
		}
		System.out.println(broiDymi+" dymi , nai-dulgata e "+naiDulgaDuma);
		
	}

}
