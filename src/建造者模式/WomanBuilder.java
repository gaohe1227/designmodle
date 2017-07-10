package 建造者模式;

/**
 * 
 * Description: 实现Builder的接口以构造和装配该产品的各个部件。 
 * 定义并明确它所创建的表示。 提供一个检索产品的接口。
 * 
 * @author:高鹤
 * @date:2017年7月10日
 */
public class WomanBuilder implements PersonBuilder {
	Person person;

	public WomanBuilder() {
		person = new Woman();
	}

	public void buildFoot() {
		person.setFoot("建造女人的脚");
	}

	public void buildHead() {
		person.setHead("建造女人的头");
	}

	public Person buildPerson() {
		return person;
	}

	@Override
	public void buildBody() {
		// TODO Auto-generated method stub
		person.setBody("建造女人的身体");
	}
}
