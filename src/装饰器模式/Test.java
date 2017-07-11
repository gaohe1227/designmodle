package 装饰器模式;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Component component=new ConcreteComponent();//创建需要被装饰的原始对象
		Decorator decorator=new ConcreteDecoratorA(component);//给对象component增加功能
		decorator.operation();

	}

}
