package ����ģʽ;

/**
 * 
 * Description:�ͻ���:����һ��������������趨���������Ľ����ߡ�
 * 
 * @author:�ߺ�
 * @date:2017��7��12��
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Receiver receiver = new Receiver();
		Command command = new ConcreteCommand(receiver);

		Invoker invoker = new Invoker(command);

		invoker.doInvokerAction();
	}

}
