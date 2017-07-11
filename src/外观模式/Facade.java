package ���ģʽ;

/**
 * 
 * Description:�����
 * 
 * @author:�ߺ�
 * @date:2017��7��11��
 */
public class Facade {
	private SubsystemA one;
	private SubsystemB two;
	private SubsystemC three;

	public Facade() {
		super();
		// TODO Auto-generated constructor stub
		one = new SubsystemA();
		two = new SubsystemB();
		three = new SubsystemC();
	}

	public void methodA() {

		one.methodOne();
		two.methodOne();
		three.methodOne();
	}

	public void methodB() {

		two.methodOne();
		three.methodOne();
	}

	public static void main(String[] args) {
		Facade f=new Facade();
		f.methodA();
	}
}

/**
 * 
 * Description:��ϵͳ��ɫ��A
 * 
 * @author:�ߺ�
 * @date:2017��7��11��
 */
class SubsystemA {
	public void methodOne() {
		System.out.println("������ϵͳA:��ʼ����");
	}
}

/**
 * 
 * Description:��ϵͳ��ɫ��B
 * 
 * @author:�ߺ�
 * @date:2017��7��11��
 */
class SubsystemB {
	public void methodOne() {
		System.out.println("������ϵͳB:���ڹ���");
	}
}

/**
 * 
 * Description:��ϵͳ��ɫ��C
 * 
 * @author:�ߺ�
 * @date:2017��7��11��
 */
class SubsystemC {
	public void methodOne() {
		System.out.println("������ϵͳC:��������");
	}
}
