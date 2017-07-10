package ԭ��ģʽ;

/**
 * 
 * Description:ǳ��������: ��ֵ���͵ĳ�Ա��������ֵ�ĸ���,���������͵ĳ�Ա����ֻ��������,���������õĶ���
 * 
 * @author:�ߺ�
 * @date:2017��7��10��
 */
public class Prototype implements Cloneable {
	private String name;
	Integer age=12;

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static void main(String[] args) {
		testPrototype();
	}

	private static void testPrototype() {
		Prototype pro = new Prototype();
		pro.setName("original object");
		pro.setAge(32);
		Prototype pro1 = (Prototype) pro.clone();
		pro.setName("changed Prototype");
		pro1.setAge(42);
		System.out.println("original object:" + pro.getName()+"-----------------"+pro.getAge());
		System.out.println("cloned object:" + pro1.getName()+"--------------------"+pro1.getAge());

	}
}
