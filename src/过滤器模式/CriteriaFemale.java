package 过滤器模式;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * Description:过滤器
 * @author:高鹤
 * @date:2017年7月11日
 */
public class CriteriaFemale implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		 List<Person> malePersons = new ArrayList<Person>(); 
	      for (Person person : persons) {
	         if(person.getGender().equalsIgnoreCase("MALE")){
	            malePersons.add(person);
	         }
	      }
	      return malePersons;
	}

}
