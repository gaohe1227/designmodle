package ������ģʽ;
/**
 * 
 * Description:ָ����;��������
 * @author:�ߺ�
 * @date:2017��7��19��
 */
public class PersonDirector {
	public Person constructPerson(PersonBuilder pb) {
		pb.buildHead();
		pb.buildBody();
		pb.buildFoot();
		return pb.buildPerson();
	}

	
}
