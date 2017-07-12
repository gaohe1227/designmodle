package 访问者模式;

/**
 * 
 * Description:抽象元素类: 接口或者抽象类，声明接受哪一类访问者访问，程序上是通过accept方法中的参数来定义的。
 *              抽象元素一般有两类方法，一部分是本身的业务逻辑，另外就是允许接收哪类访问者来访问
 * 
 * @author:高鹤
 * @date:2017年7月12日
 */
public abstract class Element {
	protected abstract void accept(Visitor visitor);
	protected abstract void doSomething();

}
