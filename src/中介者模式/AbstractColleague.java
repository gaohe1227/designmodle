package �н���ģʽ;
/**
 * 
 * Description:����ͬ����
 * @author:�ߺ�
 * @date:2017��7��10��
 */
public abstract class AbstractColleague {
	protected int number;  
	  
    public int getNumber() {  
        return number;  
    }  
  
    public void setNumber(int number){  
        this.number = number;  
    }  
    //ע������Ĳ���������ͬ���࣬����һ���н���  
    public abstract void setNumber(int number, AbstractMediator am);  
}
