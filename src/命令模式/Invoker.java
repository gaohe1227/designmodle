package ����ģʽ;
/**
 * 
 * Description:���������߽�ɫ����������������ִ����������
 * @author:�ߺ�
 * @date:2017��7��12��
 */
public class Invoker {
	/**
	 * ����������������
	 */
	private Command command;

	public Invoker(Command command) {
		super();
		this.command = command;
	}
	/**
	 * ��������������ִ��
	 * @Title: doInvokerAction
	 * @Description: TODO
	 * @param 
	 * @return void
	 * @throws
	 */
	public void doInvokerAction(){
		command.execute();
	}
}
