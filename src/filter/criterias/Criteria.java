package filter.criterias;

import java.util.List;

import filter.User;

public interface Criteria {
	public List<User> meetCriteria(List<User> users);
}
