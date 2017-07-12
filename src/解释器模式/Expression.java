package 解释器模式;
/**
 * 
 * Description:抽象表达式
 * @author:高鹤
 * @date:2017年7月12日
 */
public interface Expression {
   public boolean interpret(String context);
}
