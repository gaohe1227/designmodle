package 代理.动态代理;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 目标对象
		Subject target = new RealSubject();

		System.out.println(target.getClass());

		// 给目标对象，创建代理对象
		Subject proxy = (Subject) new ProxyFactory(target).getProxyIntsnace();// 创建代理对象
		// class $Proxy0 内存中动态生成的代理对象
		System.out.println(proxy.getClass());

		// 执行方法 【代理对象】
		proxy.request();
	}

}
