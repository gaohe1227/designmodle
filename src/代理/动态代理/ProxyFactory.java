package ����.��̬����;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

 

public class ProxyFactory {
	private Object target;// Ŀ�����

	public ProxyFactory(Object target) {
		super();
		this.target = target;
	}
    /**
     * ��Ŀ���������һ���������
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
						System.out.println("��ʼ");
						Object returnValue = method.invoke(target, args);
						System.out.println("����");
						return returnValue;
					}
				});

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
