package ������ģʽ;

public class AndExpression implements Expression {
	private Expression expression1;
	private Expression expression2;

	public AndExpression(Expression expression1, Expression expression2) {
		super();
		this.expression1 = expression1;
		this.expression2 = expression2;
	}
  /**
   * context����������
   */
	@Override
	public boolean interpret(String context) {
		// TODO Auto-generated method stub
		return expression1.interpret(context)&&expression1.interpret(context);
	}

}
