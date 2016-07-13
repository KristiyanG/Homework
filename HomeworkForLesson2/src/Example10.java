import java.util.Scanner;


public class Example10 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Vuvedete obema (10:9999) : ");
	int obem=sc.nextInt();
	if(obem<10||obem>9999){System.out.println("Obemut ne e v intervala !!!");}
	else {
	int ostatuk=obem%5;
	int broi=obem/5;
	
	if(ostatuk==0){
		
		System.out.println(broi+ " puti po 2 litra ");
		System.out.println(broi + "puti po 3 litra");
	}
	else if(ostatuk==1){
		
		System.out.println((--broi)+ " puti po 2 litra ");
		System.out.println((++broi) +  " puti po 3 litra");
		System.out.println("Dopulnitelno kofa ot 3 litra .");
	}
	else if(ostatuk==2){
		
		System.out.println(broi+ " puti po 2 litra ");
		System.out.println(broi + " puti po 3 litra");
		System.out.println("Dopulnitelna kofa ot 2 litra");
	}	
	else if(ostatuk==3){
		
		System.out.println(broi +" puti po 2 litra ");
		System.out.println(broi + " puti po 3 litra");
		System.out.println("Dopulnitelna kofa ot 3 litra");
	}	
	else if(ostatuk==4){
	
		System.out.println(broi+ " puti po 2 litra ");
		System.out.println(broi + "puti po 3 litra");
		System.out.println("Dopulnitelno 2 kofi ot 2 litra .");
	}
	}
}
}
