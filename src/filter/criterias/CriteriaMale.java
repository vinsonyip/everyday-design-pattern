package filter.criterias;

import java.util.ArrayList;
import java.util.List;

import filter.User;

public class CriteriaMale implements Criteria {
	
	@Override
	public List<User> meetCriteria(List<User> users) {
		System.out.println("Processing male user");
		
		// TODO Auto-generated method stub
		List<User> result = new ArrayList<User>();
		for(User i : users) {
			if(i.getGender().equalsIgnoreCase("Male")) {
				result.add(i);
			}
		}
		
		return result;
	}

}
