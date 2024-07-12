package structural_patterns.filter_pattern.criterias;

import java.util.ArrayList;
import java.util.List;

import structural_patterns.filter_pattern.User;

public class CriteriaAdult implements Criteria {

	@Override
	public List<User> meetCriteria(List<User> users) {
		System.out.println("Processing adult user");
		// TODO Auto-generated method stub
		var result = new ArrayList<User>();
		for(User i : users) {
			if(i.getAge() >= 18) {
				result.add(i);
			}
		}
		return result;
	}

}
