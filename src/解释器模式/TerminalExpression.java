package ������ģʽ;

/**
 * 
 * Description:������ʽ
 * 
 * @author:�ߺ�
 * @date:2017��7��12��
 */
public class TerminalExpression implements Expression {
	private String data;

	public TerminalExpression(String data) {
		super();
		this.data = data;
	}

	@Override
	public boolean interpret(String context) {
		// TODO Auto-generated method stub
		if(context.contains(data)){
			return true;
		}
		return false;
	}

}
