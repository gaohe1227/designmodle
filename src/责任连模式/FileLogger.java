package 责任连模式;
/**
 * 
 * Description:具体处理者
 * @author:高鹤
 * @date:2017年7月11日
 */
public class FileLogger extends AbstractLogger {

	public FileLogger(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		// TODO Auto-generated method stub
		   System.out.println("文件日志::Logger: " + message);
	}

}
