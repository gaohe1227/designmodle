package 装饰器模式;
/**
 * 
 * Description:具体的组件对象，实现了组件接口。该对象通常就是被装饰器装饰的原始对象，可以给这个对象添加职责;
 * @author:高鹤
 * @date:2017年7月11日
 */
public class ConcreteComponent implements Component {

	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("我是一个需要被装饰的对象");

	}

}
