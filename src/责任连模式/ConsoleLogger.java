package ������ģʽ;

/**
 * 
 * Description: ���崦����
 * 
 * @author:�ߺ�
 * @date:2017��7��11��
 */
public class ConsoleLogger extends AbstractLogger {
	public ConsoleLogger(int level) {
		this.level = level;
	}

	@Override
	protected void write(String message) {
		// TODO Auto-generated method stub
		System.out.println("��׼���  Console::Logger" + level + ": " + message);
	}

}
