package 访问者模式;
/**
 * 
 * Description:元素类:实现抽象元素类所声明的accept方法，通常都是visitor.visit(this)，基本上已经形成一种定式了。
 * @author:高鹤
 * @date:2017年7月12日
 */
public class ConcreteElement1 extends Element {

	@Override
	protected void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
		
	}

	@Override
	protected void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("这是元素ConcreteElement1");
	}

}
