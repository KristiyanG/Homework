
public class Example23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1;
		int y=1;
		while(x<=9){
			while(y<=9){
				System.out.print(x+"*"+y+"; ");
				y++;
			}
			System.out.println();
			
			x++;
			y=x;
			
		}
	}

}
