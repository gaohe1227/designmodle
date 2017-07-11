package ¹ýÂËÆ÷Ä£Ê½;

import java.util.ArrayList;
import java.util.List;

public class SingleFilter implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		 List<Person> malePersons = new ArrayList<Person>(); 
	      for (Person person : persons) {
	         if(person.getMaritalStatus().equalsIgnoreCase("Single")){
	            malePersons.add(person);
	         }
	      }
	      return malePersons;
	}

}
