package 过滤器模式;

import java.util.List;

/**
 * 
 * Description:过滤器接口
 * @author:高鹤
 * @date:2017年7月10日
 */
public interface Criteria {
	/**
	 * 过滤方法
	 * @Title: meetCriteria
	 * @Description: TODO
	 * @param @param persons
	 * @param @return
	 * @return List<Person>
	 * @throws
	 */
	 public List<Person> meetCriteria(List<Person> persons);
 
}
