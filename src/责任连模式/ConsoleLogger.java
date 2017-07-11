package 责任连模式;

/**
 * 
 * Description: 具体处理者
 * 
 * @author:高鹤
 * @date:2017年7月11日
 */
public class ConsoleLogger extends AbstractLogger {
	public ConsoleLogger(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		// TODO Auto-generated method stub
		System.out.println("标准输出  Console::Logger" + level + ": " + message);
	}

}
