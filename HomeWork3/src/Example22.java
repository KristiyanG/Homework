import java.util.Scanner;


public class Example22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i;
		do{
			System.out.println("Vuvedi chislo...");
			i=sc.nextInt();
		}
		while(i<1||i>999);
		int x=1;
		
        while(x<=10){
        	
        	if(i%2==0||i%3==0||i%5==0){
        		
        		System.out.println(x+":"+i);
        		i++;
        		x++;
        		}
        	else {
        		i++;
        	}
        		
        	
        }
	}

}
