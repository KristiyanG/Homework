import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Gsm {

	String model;
	boolean hasSimCard;
	String simMobileNumber1;
	int outgoingCallsDuration;
	Call lastIncomingCall;
	Call lastOutgoingCall;
	
	void insertSimCard(String simMobileNumber){
		
	      
	        String regex = "(08)[0-9]{8}";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(simMobileNumber);

	        if (matcher.matches()) {
	        	simMobileNumber1=simMobileNumber;
				hasSimCard=true;
	        } 
			
			
		}
	
	void removeSimCard(){
		hasSimCard=false;
	}

	void call(Gsm reciever, double duration){
	
		if(duration>0){
			if(!this.equals(reciever)){
				if(this.hasSimCard&& reciever.hasSimCard){
					Call a=new Call();
					a.duration=duration;
					this.lastOutgoingCall=a;
					this.outgoingCallsDuration+=a.duration;
					reciever.lastIncomingCall=a;
				}
			}
		}
	}

	
	double getSumForCall(double priceForAMinute){
		return outgoingCallsDuration*priceForAMinute;
	}
	
	void printInfoForLastOutgoingCall(){
		System.out.println("InfoForLastOutgoingCall "+ lastOutgoingCall+ " model -"+model+" number "+simMobileNumber1);
	}
	
	void printInfoForTheLastIncomingCall(){
		System.out.println("InfoForTheLastIncomingCall "+lastIncomingCall+ " model -"+model+" number "+simMobileNumber1);
	}


	
}
