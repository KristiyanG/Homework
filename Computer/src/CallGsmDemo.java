
public class CallGsmDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gsm phone1=new Gsm();
		phone1.model="Samsung";
		phone1.insertSimCard("0896147121");
		Gsm phone2=new Gsm();
		phone2.model="HTC";
		phone2.insertSimCard("0845651520");
		
		phone1.call(phone2, 12);
		phone1.printInfoForLastOutgoingCall();
		phone2.call(phone1, 5);
		System.out.println(phone2.getSumForCall(0.12));;
	}

}
