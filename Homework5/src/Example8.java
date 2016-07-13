import java.util.Scanner;

public class Example8 {
 
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
		int y;
		
		do{
		System.out.println("Duljina na masiv 1");
		y=sc.nextInt();
		}
		while(y<0);
		int[] arr=new int[y];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Vuvedi danni v masiv 1 ");
			int x=sc.nextInt();
			arr[i]=x;	
		}
           
        int length ;
        int maxlength = 0;
        int value =arr[0];
       
        for (int i = 1; i < arr.length; i++) {
                length = 1;
                while(arr[i] == arr[i-1]){
                        length++;
                        i++;
                        if(i == arr.length)
                                break;
                }
                if(maxlength < length){
                        maxlength = length;
                        value = arr[i - 1];
                }
        }
        System.out.print("{");
        for (int i = 0; i < maxlength - 1; i++) {
                System.out.print(value + ", ");
        }
        System.out.println(value + "}");
    }
}