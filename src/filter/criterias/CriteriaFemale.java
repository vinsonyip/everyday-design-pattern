package filter.criterias;

import java.util.ArrayList;
import java.util.List;

import filter.User;

public class CriteriaFemale implements Criteria {

	@Override
	public List<User> meetCriteria(List<User> users) {
		System.out.println("Processing female user");
		// TODO Auto-generated method stub
		var result = new ArrayList<User>();
		for(User i : users) {
			if(i.getGender().equalsIgnoreCase("Female")) {
				result.add(i);
			}
		}
		return result;
	}

}
