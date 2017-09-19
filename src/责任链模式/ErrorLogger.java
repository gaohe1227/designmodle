package 责任链模式;
/**
 * 
 * Description:具体处理者
 * @author:高鹤
 * @date:2017年7月11日
 */
public class ErrorLogger extends AbstractLogger {
	public ErrorLogger(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		// TODO Auto-generated method stub
		System.out.println("错误输出  Console::Logger" + level + ": " + message);
	}

}
