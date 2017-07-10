package 原型模式;

/**
 * 
 * Description:浅拷贝案例: 对值类型的成员变量进行值的复制,对引用类型的成员变量只复制引用,不复制引用的对象
 * 
 * @author:高鹤
 * @date:2017年7月10日
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
