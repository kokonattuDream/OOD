
public class Employee {
	protected Rank rank;
	protected Call current_call;
	protected CallHandler call_handler;
	
	public Employee(CallHandler call_handler){
		this.call_handler = call_handler;
	}
	
	public void receiveCall(Call call){
		current_call = call;
	}
	
	public void completeCall(){
		current_call = null;
	}
	
	public void escalatecall() throws Exception{
		if(rank != Rank.DIRECTOR){
			current_call.callEscalated();
			call_handler.escalateCall(current_call);
			current_call = null;
		} else {
			throw new Exception("Cannot escalate");
		}
		
	}
	
	public void getNewCall(){
		call_handler.getCall(this);
	}
	
	public boolean isFree(){
		return current_call == null;
	}
	
	public Rank getRank(){
		return rank;
	}
}
