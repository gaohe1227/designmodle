package �н���ģʽ;
/**
 * 
 * Description:�����н���
 * @author:�ߺ�
 * @date:2017��7��10��
 */
public abstract class AbstractMediator {
	protected AbstractColleague A;  
    protected AbstractColleague B;  
      
    public AbstractMediator(AbstractColleague a, AbstractColleague b) {  
        A = a;  
        B = b;  
    }  
  
    public abstract void AaffectB();  
      
    public abstract void BaffectA(); 

}
