package 原型模式;

/**
 * 
 * Description:深拷贝
 * 
 * @author:高鹤
 * @date:2017年7月10日
 */
public class NewPrototype implements Cloneable {

	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	private Prototype Prototype;

	public Prototype getPrototype() {
		return Prototype;
	}

	public void setPrototype(Prototype Prototype) {
		this.Prototype = Prototype;
	}

	public Object clone() {
		NewPrototype ret = null;
		try {
			ret = (NewPrototype) super.clone();
			ret.Prototype = (Prototype) this.Prototype.clone();
			return ret;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static void main(String[] args) {
		testDeepCopy();
	}

	private static void testDeepCopy() {
		Prototype pro = new Prototype();
		pro.setName("original object");
		NewPrototype newObj = new NewPrototype();
		newObj.setId("test1");
		newObj.setPrototype(pro);

		NewPrototype copyObj = (NewPrototype) newObj.clone();
		copyObj.setId("testCopy");
		copyObj.getPrototype().setName("changed object");

		System.out.println("original object id:" + newObj.getId());
		System.out.println("original object name:" + newObj.getPrototype().getName());

		System.out.println("cloned object id:" + copyObj.getId());
		System.out.println("cloned object name:" + copyObj.getPrototype().getName());

	}
}