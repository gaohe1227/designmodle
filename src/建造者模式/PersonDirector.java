package 建造者模式;
/**
 * 
 * Description:指导类;管理构建着
 * @author:高鹤
 * @date:2017年7月19日
 */
public class PersonDirector {
	public Person constructPerson(PersonBuilder pb) {
		pb.buildHead();
		pb.buildBody();
		pb.buildFoot();
		return pb.buildPerson();
	}

	
}
