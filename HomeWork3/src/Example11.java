
public class Example11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
        int rows=3;
        int zvezdichki=1;
        for(int row=1;row<=rows;row++){
        	for(int i=1;i<=rows-row;i++){
        		System.out.print(" ");
        	}
        	for(int x=1;x<=zvezdichki;x++){
        		System.out.print("*");
        	}
        	System.out.println();
        	zvezdichki+=2;
        }
		
			
   
	
	}
	

}
