package ������ģʽ;

/**
 * 
 * Title:Adapter1 
 * Description:����������
 * 
 * @author:�ߺ�
 * @date:2017��7��10��
 */
public class Adapter1 implements Target {
	// ֱ�ӹ�����������
	private Adaptee adaptee;

	// ����ͨ�����캯�����������Ҫ����ı����������
	public Adapter1(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void request() {
		// TODO Auto-generated method stub
		this.adaptee.specificRequest();
	}
	public static void main(String[] args) {
		// ʹ����ͨ������
		Target concreteTarget = new ConcreteTarget();
		concreteTarget.request();
		
		// ʹ�����⹦���࣬�������࣬
		// ��Ҫ�ȴ���һ����������Ķ�����Ϊ����
		Target adapter = new Adapter1(new Adaptee());
		adapter.request();
	}

}
