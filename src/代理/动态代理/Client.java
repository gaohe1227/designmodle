package ����.��̬����;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ŀ�����
		Subject target = new RealSubject();

		System.out.println(target.getClass());

		// ��Ŀ����󣬴����������
		Subject proxy = (Subject) new ProxyFactory(target).getProxyIntsnace();// �����������
		// class $Proxy0 �ڴ��ж�̬���ɵĴ������
		System.out.println(proxy.getClass());

		// ִ�з��� ���������
		proxy.request();
	}

}
