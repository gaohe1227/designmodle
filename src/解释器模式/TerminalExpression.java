package 解释器模式;

/**
 * 
 * Description:具体表达式
 * 
 * @author:高鹤
 * @date:2017年7月12日
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
