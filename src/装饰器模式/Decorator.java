package 装饰器模式;

/**
 * 
 * Description:：所有装饰器的父类，需要定义一个与组件接口一致的接口
 * (主要是为了实现装饰器功能的复用，即具体的装饰器A可以装饰另外一个具体的装饰器B，因为装饰器类也是一个Component)
 * ，并持有一个Component对象，该对象其实就是被装饰的对象。如果不继承组件接口类，
 * 则只能为某个组件添加单一的功能，即装饰器对象不能在装饰其他的装饰器对象
 * 
 * @author:高鹤
 * @date:2017年7月11日
 */
public abstract class Decorator implements Component {
	/**
	 * 持有组件对象
	 */
    protected Component component;
    
     /**
      * 构造方法，传入组件对象
      * @param component
      */
	
	public Decorator(Component component) {
		super();
		this.component = component;
	}



	public  void operation(){
		  //转发请求给组件对象，可以在转发前后执行一些附加动作  
        component.operation(); 
	}

}
