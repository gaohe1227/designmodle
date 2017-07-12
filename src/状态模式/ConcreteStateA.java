package 状态模式;
/**
 * 
 * Description:具体状态类
 * @author:高鹤
 * @date:2017年7月12日
 */
public class ConcreteStateA implements State {

	@Override
	public void doAction(String sampleParameter) {
		// TODO Auto-generated method stub
		  System.out.println("ConcreteStateA doAction ：" + sampleParameter);
	}

}
