package �н���ģʽ;
/**
 * 
 * Description:ͬ��ʵ����
 * @author:�ߺ�
 * @date:2017��7��10��
 */
public class ColleagueA extends AbstractColleague {

	@Override
	public void setNumber(int number, AbstractMediator am) {
		// TODO Auto-generated method stub
		 this.number = number;  
	        am.AaffectB();  

	}

}
