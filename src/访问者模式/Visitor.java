package 访问者模式;

/**
 * 
 * Description:抽象访问者:抽象类或者接口，声明访问者可以访问哪些元素，
 *     具体到程序中就是visit方法中的参数定义哪些对象是可以被访问的
 * 
 * @author:高鹤
 * @date:2017年7月12日
 */
public interface Visitor {
	public void visit(ConcreteElement1 concreteElement1);
	public void visit(ConcreteElement2 concreteElement2);
}
