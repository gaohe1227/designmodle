package 适配器模式;
/**
 * 
 * Title:Adapter
 * Description: 适配器类，继承了被适配类，同时实现标准接口
 * @author:高鹤
 * @date:2017年7月10日
 */
public class Adapter extends Adaptee implements Target {

	@Override
	public void request() {
		// TODO Auto-generated method stub
		super.specificRequest();

	}
	public static void main(String[] args) {
		// 使用普通功能类
		Target concreteTarget = new ConcreteTarget();
		concreteTarget.request();
		
		// 使用特殊功能类，即适配类
		Target adapter = new Adapter();
		adapter.request();
	}
}
