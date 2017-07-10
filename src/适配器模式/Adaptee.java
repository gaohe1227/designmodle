package 适配器模式;
/**
 * 
 * Title:Adaptee
 * Description:已存在的、具有特殊功能、但不符合我们既有的标准接口的类
 * @author:高鹤
 * @date:2017年7月10日
 */
public class Adaptee {
	public void specificRequest() {
		System.out.println("被适配类具有 特殊功能...");
	}
}
