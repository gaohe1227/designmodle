package 工厂模式.简单工厂模式;
/**
 * 
 * Title:OperationFactory
 * Description:核心工厂类:
 * 将创建对象的工作交给工厂负责，使客户端调用和运算类解耦，当我们更改运算类时，客户端代码不会受到影响，也不需要修改
 * Company:chaoxing
 * @author:高鹤
 * @date:2017年7月5日
 */
public class OperationFactory {
	public static Operation createOperation(String operate) {  
        Operation op = null;  
        if(operate == null)  
            throw new RuntimeException("运算符不能为空！");  
        else if(operate.equals("+"))  
            op = new AddOperation();  
        else if(operate.equals("-"))  
            op = new SubOperation();  
        else if(operate.equals("*"))  
            op = new MulOperation();  
        else if(operate.equals("/"))  
            op = new DivOperation();  
        else  
            throw new RuntimeException("运算符错误！");  
        return op;  
    }  
}
