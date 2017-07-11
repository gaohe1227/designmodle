package 外观模式;

/**
 * 
 * Description:外观类
 * 
 * @author:高鹤
 * @date:2017年7月11日
 */
public class Facade {
	private SubsystemA one;
	private SubsystemB two;
	private SubsystemC three;

	public Facade() {
		super();
		// TODO Auto-generated constructor stub
		one = new SubsystemA();
		two = new SubsystemB();
		three = new SubsystemC();
	}

	public void methodA() {

		one.methodOne();
		two.methodOne();
		three.methodOne();
	}

	public void methodB() {

		two.methodOne();
		three.methodOne();
	}

	public static void main(String[] args) {
		Facade f=new Facade();
		f.methodA();
	}
}

/**
 * 
 * Description:子系统角色类A
 * 
 * @author:高鹤
 * @date:2017年7月11日
 */
class SubsystemA {
	public void methodOne() {
		System.out.println("我是子系统A:开始工作");
	}
}

/**
 * 
 * Description:子系统角色类B
 * 
 * @author:高鹤
 * @date:2017年7月11日
 */
class SubsystemB {
	public void methodOne() {
		System.out.println("我是子系统B:正在工作");
	}
}

/**
 * 
 * Description:子系统角色类C
 * 
 * @author:高鹤
 * @date:2017年7月11日
 */
class SubsystemC {
	public void methodOne() {
		System.out.println("我是子系统C:结束工作");
	}
}
