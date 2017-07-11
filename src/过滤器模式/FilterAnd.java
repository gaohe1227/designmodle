package 过滤器模式;

import java.util.List;
/**
 * 
 * Description:多个过滤器
 * @author:高鹤
 * @date:2017年7月11日
 */
public class FilterAnd implements Criteria {
	private Criteria filter;
	private Criteria otherFilter;

	public FilterAnd(Criteria filter, Criteria otherFilter) {
		super();
		this.filter = filter;
		this.otherFilter = otherFilter;
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		// TODO Auto-generated method stub
		List<Person>  list1=filter.meetCriteria(persons);
		return otherFilter.meetCriteria(list1);
	}

}
