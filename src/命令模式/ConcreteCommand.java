package 命令模式;

/**
 * 
 * Description:具体命令角色:实现命令接口,是“虚”的实现，通常会有接收者,调用接收者的方法来执行命令
 * 
 * @author:高鹤
 * @date:2017年7月12日
 */
public class ConcreteCommand implements Command {
	/**
	 * 持有接收者的引用
	 */
	private Receiver receiver;

	public ConcreteCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("具体命令角色将命令委托给接收者");
		receiver.doAction();

	}

}
