package filter.criterias;

import java.util.List;

import filter.User;

public class CriteriaOR implements Criteria {
	public Criteria criteria;
	public Criteria otherCriteria;
	
	public CriteriaOR(Criteria criteria1, Criteria criteria2) {
		this.criteria = criteria1;
		this.otherCriteria = criteria2;
	}
	@Override
	public List<User> meetCriteria(List<User> users) {
		System.out.println("Processing OR criteria");
		// TODO Auto-generated method stub
		List<User> criteriaResult = criteria.meetCriteria(users);
		List<User> otherCriteriaResult = otherCriteria.meetCriteria(users);
		
		for(User i : otherCriteriaResult) {
			if(!criteriaResult.contains(i)) {
				criteriaResult.add(i);
			}
		}
		return criteriaResult;
	}

}
