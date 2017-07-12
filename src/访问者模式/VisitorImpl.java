package 访问者模式;
/**
 * 
 * Description:实际访问者：实现抽象访问者所声明的方法，它影响到访问者访问到一个类后该干什么，要做什么事情。
 * @author:高鹤
 * @date:2017年7月12日
 */
public class VisitorImpl implements Visitor {

	@Override
	public void visit(ConcreteElement1 concreteElement1) {
		// TODO Auto-generated method stub
		concreteElement1.doSomething();
	}

	@Override
	public void visit(ConcreteElement2 concreteElement2) {
		// TODO Auto-generated method stub
		concreteElement2.doSomething();
	}

}
