package ����ģʽ;

/**
 * 
 * Description:���������ɫ:ʵ������ӿ�,�ǡ��顱��ʵ�֣�ͨ�����н�����,���ý����ߵķ�����ִ������
 * 
 * @author:�ߺ�
 * @date:2017��7��12��
 */
public class ConcreteCommand implements Command {
	/**
	 * ���н����ߵ�����
	 */
	private Receiver receiver;

	public ConcreteCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("���������ɫ������ί�и�������");
		receiver.doAction();

	}

}
