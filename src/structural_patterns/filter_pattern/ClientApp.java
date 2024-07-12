package structural_patterns.filter_pattern;

import java.util.ArrayList;
import java.util.List;

import structural_patterns.filter_pattern.criterias.Criteria;
import structural_patterns.filter_pattern.criterias.CriteriaAdult;
import structural_patterns.filter_pattern.criterias.CriteriaAnd;
import structural_patterns.filter_pattern.criterias.CriteriaFemale;
import structural_patterns.filter_pattern.criterias.CriteriaMale;
import structural_patterns.filter_pattern.criterias.CriteriaOR;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<User> users = new ArrayList<User>();
		users.add(new User("Vinson", "Male", 20));
		users.add(new User("John", "Male", 15));
		users.add(new User("Mandy", "Female", 23));
		users.add(new User("Kelvin", "Male", 34));
		users.add(new User("Carl", "Male", 32));
		users.add(new User("Ashley", "Female", 25));
		
		Criteria maleUsers = new CriteriaMale();
		printPersons(maleUsers.meetCriteria(users));
		
		Criteria femaleUsers = new CriteriaFemale();
		printPersons(femaleUsers.meetCriteria(users));
		
		Criteria maleOrFemaleUsers = new CriteriaOR(maleUsers, femaleUsers);
		printPersons(maleOrFemaleUsers.meetCriteria(users));
		
		Criteria maleAndFemaleUsers = new CriteriaAnd(maleUsers, femaleUsers);
		printPersons(maleAndFemaleUsers.meetCriteria(users));
		
		Criteria adultUsers = new CriteriaAdult();
		Criteria adultAndMaleUsers = new CriteriaAnd(maleUsers, adultUsers);
		printPersons(adultAndMaleUsers.meetCriteria(users));
		
		
		
	}
	
	 public static void printPersons(List<User> users){
		   
	      for (User person : users) {
	         System.out.println("Person : [ Name : " + person.getName() + ", Gender : " + person.getGender() + ", Marital Status : " + person.getAge() + " ]");
	      }
	      System.out.println("");
	   }
}
