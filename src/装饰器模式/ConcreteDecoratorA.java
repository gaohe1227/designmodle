package 装饰器模式;
/**
 * 
 * Description:装饰器的具体实现对象，向组件对象添加职责，
 * operationFirst()，operationLast()为前后需要添加的功能
 * @author:高鹤
 * @date:2017年7月11日
 */
public class ConcreteDecoratorA extends Decorator{

	public ConcreteDecoratorA(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	  private void operationFirst(){System.out.println("执行前的方法"); } //在调用父类的operation方法之前需要执行的操作  
      private void operationLast(){System.out.println("执行后的方法"); } //在调用父类的operation方法之后需要执行的操作  
      public void operation() {  
          //调用父类的方法，可以在调用前后执行一些附加动作  
          operationFirst(); //添加的功能  
          super.operation();  //这里可以选择性的调用父类的方法，如果不调用则相当于完全改写了方法，实现了新的功能  
          operationLast(); //添加的功能  
  }  
}
