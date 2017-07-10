package 适配器模式;
/**
 * 
 * Title:ConcreteTarget
 * Description:具体目标类，只提供普通功能
 * @author:高鹤
 * @date:2017年7月10日
 */
public class ConcreteTarget implements Target {

	@Override
	public void request() {
		// TODO Auto-generated method stub
		System.out.println("普通类 具有 普通功能...");
	}

}
