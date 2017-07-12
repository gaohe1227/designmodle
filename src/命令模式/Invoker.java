package 命令模式;
/**
 * 
 * Description:命令请求者角色：负责调用命令对象执行命令请求
 * @author:高鹤
 * @date:2017年7月12日
 */
public class Invoker {
	/**
	 * 持有命令对象的引用
	 */
	private Command command;

	public Invoker(Command command) {
		super();
		this.command = command;
	}
	/**
	 * 将动作交给命令执行
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
