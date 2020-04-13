
public class Call {
	private String caller;
	private Employee responser;
	private int call_rank;
	
	public Call(String name){
		caller = name;
		this.call_rank = 1;
	}
	
	public int getCallRank(){
		return call_rank;
	}
	
	public void callEscalated(){
		call_rank++;
	}
	
	public void setResponser(Employee emp){
		responser = emp;
	}
}
