package ������ģʽ;
/**
 * 
 * Description:���幹����
 * @author:�ߺ�
 * @date:2017��7��19��
 */
public class ManBuilder implements PersonBuilder {

	Person person;

	public ManBuilder() {
		person = new Man();
	}

	public void buildBody() {
		person.setBody("�������˵�����");
	}

	public void buildFoot() {
		person.setFoot("�������˵Ľ�");
	}

	public void buildHead() {
		person.setHead("�������˵�ͷ");
	}

	public Person buildPerson() {
		return person;
	}

}
