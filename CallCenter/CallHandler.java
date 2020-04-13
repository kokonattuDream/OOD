import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CallHandler {
	
	List<List<Employee>> employees_level;
	List<Queue<Call>> awaitingCalls;
	
	public CallHandler(List<Respondent> respondents, List<Manager> managers, List<Director> directors){
		List<Employee> employees_level = new ArrayList<>();
		employees_level.add((Employee) respondents);
		employees_level.add((Employee) managers);
		employees_level.add((Employee) directors);
		
		List<Queue<Call>> awaitingCalls = new ArrayList<>();
		awaitingCalls.add(new LinkedList<>());
		awaitingCalls.add(new LinkedList<>());
		awaitingCalls.add(new LinkedList<>());
	}
	
	public void dispatchCall(Call call){
		boolean found = false;
		int level = call.getCallRank();
		for(Employee employee : employees_level.get(level - 1)){
			if(employee.isFree()){
				call.setResponser(employee);
				employee.receiveCall(call);
				found = true;
				
				break;
			}
		}
		if(!found){
			awaitingCalls.get(level - 1).offer(call);
		}
	}
	
	public void escalateCall(Call call){
		dispatchCall(call);
	}
	
	public String getCall(Employee emp){
		int level = 0;
		switch(emp.rank){
			case RESPONDENT:
				level = 1;
				break;
			case MANAGER:
				level = 2;
				break;
			case DIRECTOR:
				level = 3;
				break;
		}
		
		if(emp.isFree()){
			int size = awaitingCalls.get(level - 1).size();
			if(size == 0){
				return "There is no awaiting calls";
			} else {
				Call call = awaitingCalls.get(level - 1).poll();
				emp.receiveCall(call);
				return "You got a new call";
			}
		} else {
			return "You already have assigned call";
		}
	}
}
