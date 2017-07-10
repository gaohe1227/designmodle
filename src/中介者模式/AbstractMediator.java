package 中介者模式;
/**
 * 
 * Description:抽象中介类
 * @author:高鹤
 * @date:2017年7月10日
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
