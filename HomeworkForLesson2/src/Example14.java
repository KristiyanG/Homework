import java.util.Scanner;


public class Example14 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Vuvedete purva dvoika kordinati(razdelete gi s enter) : ");
	int x1=sc.nextInt();
	int y1=sc.nextInt();
	System.out.println("Vuvedete vtora dvoika kordinati(razdelete gi s enter) : ");
	int x2=sc.nextInt();
	int y2=sc.nextInt();
	if((x1<0||x1>8)||(x2<0||x2>8)||(y1<0||y1>8)||(y2<0||y2>8)){
		System.out.println("Nqma takova pole !");
	}
	else {
		int pole1=(x1+y1)%2;
		int pole2=(x2+y2)%2;
		if(((pole1)==0&&(pole2==1))||((pole1)==1&&(pole2==0))){
			System.out.println("Poletata "+"["+x1+";"+y1+"]"+" i "+ "["+x2+";"+y2+"]"+   "sa sus razlichen cvqt !");
		}
		else {
			System.out.println("Poletata "+"["+x1+";"+y1+"]"+" i "+ "["+x2+";"+y2+"]"+   "sa sus ednakuv cvqt !");
	
		}
	}
}
}
