package 责任链模式;

/**
 * 
 * Description:抽象处理者
 * 
 * @author:高鹤
 * @date:2017年7月11日
 */
public abstract class AbstractLogger {
	/**
	 * 日志的三个等级
	 */
	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;
	protected int level;

	// 责任链中的下一个元素
	protected AbstractLogger nextLogger;

	public void setNextLogger(AbstractLogger nextLogger) {
		this.nextLogger = nextLogger;
	}

	public void logMessage(int level, String message) {
		if (this.level <= level) {
			write(message);
		}
		if (nextLogger != null) {
			nextLogger.logMessage(level, message);
		}
	}

	abstract protected void write(String message);

}
