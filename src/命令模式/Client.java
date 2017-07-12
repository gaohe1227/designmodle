package 命令模式;

/**
 * 
 * Description:客户端:创建一个具体命令对象并设定该命令对象的接收者。
 * 
 * @author:高鹤
 * @date:2017年7月12日
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
