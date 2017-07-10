package 代理.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

 

public class ProxyFactory {
	private Object target;// 目标对象

	public ProxyFactory(Object target) {
		super();
		this.target = target;
	}
    /**
     * 给目标对象生成一个代理对象
     * @Title: getProxyIntsnace
     * @Description: TODO
     * @param @return
     * @return Object
     * @throws
     */
	public Object getProxyIntsnace() { 
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
				new InvocationHandler() {

					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						// TODO Auto-generated method stub
						System.out.println("开始");
						Object returnValue = method.invoke(target, args);
						System.out.println("结束");
						return returnValue;
					}
				});

	}
	public static void main(String[] args) {
        // 目标对象
		Subject target = new RealSubject();
 
        System.out.println(target.getClass());

        // 给目标对象，创建代理对象
        Subject proxy =  (Subject) new ProxyFactory(target).getProxyIntsnace();//创建代理对象
        // class $Proxy0   内存中动态生成的代理对象
        System.out.println(proxy.getClass());

        // 执行方法   【代理对象】
    proxy.request();
    }
}
interface Subject {
	void request();
}

class RealSubject implements Subject {
	public void request() {
		System.out.println("RealSubject");
	}
}
