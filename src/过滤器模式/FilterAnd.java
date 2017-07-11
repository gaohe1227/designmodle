package ������ģʽ;

import java.util.List;
/**
 * 
 * Description:���������
 * @author:�ߺ�
 * @date:2017��7��11��
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
