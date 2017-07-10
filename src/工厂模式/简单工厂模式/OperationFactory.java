package ����ģʽ.�򵥹���ģʽ;
/**
 * 
 * Title:OperationFactory
 * Description:���Ĺ�����:
 * ����������Ĺ���������������ʹ�ͻ��˵��ú��������������Ǹ���������ʱ���ͻ��˴��벻���ܵ�Ӱ�죬Ҳ����Ҫ�޸�
 * Company:chaoxing
 * @author:�ߺ�
 * @date:2017��7��5��
 */
public class OperationFactory {
	public static Operation createOperation(String operate) {  
        Operation op = null;  
        if(operate == null)  
            throw new RuntimeException("���������Ϊ�գ�");  
        else if(operate.equals("+"))  
            op = new AddOperation();  
        else if(operate.equals("-"))  
            op = new SubOperation();  
        else if(operate.equals("*"))  
            op = new MulOperation();  
        else if(operate.equals("/"))  
            op = new DivOperation();  
        else  
            throw new RuntimeException("���������");  
        return op;  
    }  
}
