package structural_patterns.filter_pattern.criterias;

import java.util.List;

import structural_patterns.filter_pattern.User;

public interface Criteria {
	public List<User> meetCriteria(List<User> users);
}
