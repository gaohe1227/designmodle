package ������ģʽ;
/**
 * 
 * Title:Adapter
 * Description: �������࣬�̳��˱������࣬ͬʱʵ�ֱ�׼�ӿ�
 * @author:�ߺ�
 * @date:2017��7��10��
 */
public class Adapter extends Adaptee implements Target {

	@Override
	public void request() {
		// TODO Auto-generated method stub
		super.specificRequest();

	}
	public static void main(String[] args) {
		// ʹ����ͨ������
		Target concreteTarget = new ConcreteTarget();
		concreteTarget.request();
		
		// ʹ�����⹦���࣬��������
		Target adapter = new Adapter();
		adapter.request();
	}
}
