import java.util.Scanner;

public class Examlpe7 {
	public static void main(String[] args) {
   Scanner sc= new Scanner(System.in);
   System.out.println("Vuvedi chas : ");
   int chas=sc.nextInt();
   System.out.println("Vuvedi pari :");
	double pari=sc.nextDouble();
	System.out.println("Zdrav li si ");
	boolean zdrave=sc.nextBoolean();
	if(!zdrave){
		System.out.println("Nqma da izlizam");
		if(pari>0){
			System.out.println("Shte si kupq lekarstva");}
			else {System.out.println("Shte piq chai .");
		}}
		else { if(pari<10){
			System.out.println("Otivam na kafe");
			}
		else System.out.println("Otivam na kino ."); 
		}
	} }
