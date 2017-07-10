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
	public static void main(String[] args) {
        // Ŀ�����
		Subject target = new RealSubject();
 
        System.out.println(target.getClass());

        // ��Ŀ����󣬴����������
        Subject proxy =  (Subject) new ProxyFactory(target).getProxyIntsnace();//�����������
        // class $Proxy0   �ڴ��ж�̬���ɵĴ������
        System.out.println(proxy.getClass());

        // ִ�з���   ���������
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
