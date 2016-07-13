
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer pc = new Computer(2000,758,1000,900);
		Computer pc1=new Computer();
		pc1.setPrice(800);
		int result=pc.comparePrice(pc1);
		if(result==-1){
			System.out.println("Pc e po-skup ot Pc1");
		}
		else if(result==1){
			System.out.println("Pc1 e po-skup ot Pc");
		}
		else{
			System.out.println("Cenite sa ednakvi");
		}
	}

}
