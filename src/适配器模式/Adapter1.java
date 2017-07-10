package 适配器模式;

/**
 * 
 * Title:Adapter1 
 * Description:对象适配器
 * 
 * @author:高鹤
 * @date:2017年7月10日
 */
public class Adapter1 implements Target {
	// 直接关联被适配类
	private Adaptee adaptee;

	// 可以通过构造函数传入具体需要适配的被适配类对象
	public Adapter1(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void request() {
		// TODO Auto-generated method stub
		this.adaptee.specificRequest();
	}
	public static void main(String[] args) {
		// 使用普通功能类
		Target concreteTarget = new ConcreteTarget();
		concreteTarget.request();
		
		// 使用特殊功能类，即适配类，
		// 需要先创建一个被适配类的对象作为参数
		Target adapter = new Adapter1(new Adaptee());
		adapter.request();
	}

}
