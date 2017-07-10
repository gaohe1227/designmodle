package ������ģʽ;

/**
 * 
 * Description: ʵ��Builder�Ľӿ��Թ����װ��ò�Ʒ�ĸ��������� 
 * ���岢��ȷ���������ı�ʾ�� �ṩһ��������Ʒ�Ľӿڡ�
 * 
 * @author:�ߺ�
 * @date:2017��7��10��
 */
public class WomanBuilder implements PersonBuilder {
	Person person;

	public WomanBuilder() {
		person = new Woman();
	}

	public void buildFoot() {
		person.setFoot("����Ů�˵Ľ�");
	}

	public void buildHead() {
		person.setHead("����Ů�˵�ͷ");
	}

	public Person buildPerson() {
		return person;
	}

	@Override
	public void buildBody() {
		// TODO Auto-generated method stub
		person.setBody("����Ů�˵�����");
	}
}
