package structural_patterns.filter_pattern.criterias;

import java.util.List;

import structural_patterns.filter_pattern.User;

public class CriteriaAnd implements Criteria {
	public Criteria criteria;
	public Criteria otherCriteria;
	public CriteriaAnd(Criteria criteria1, Criteria criteria2) {
		criteria = criteria1;
		otherCriteria = criteria2;
	}
	@Override
	public List<User> meetCriteria(List<User> users) {
		System.out.println("Processing AND criteria");
		// TODO Auto-generated method stub
		var criteriaResult = criteria.meetCriteria(users);
		var otherCriteriaResult = otherCriteria.meetCriteria(criteriaResult);
		
		return otherCriteriaResult;
		
	}

}
