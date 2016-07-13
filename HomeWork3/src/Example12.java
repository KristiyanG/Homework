
public class Example12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x=999;
        for (int i=100;i<=x;i++){
        	int a=i/100;
        	int b=i%100/10;
        	int c=i%10;
        	if(a==b||a==c||c==b){
        		continue;
        	}
        	else System.out.println(i);
        }
	}

}
