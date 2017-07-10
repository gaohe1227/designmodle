package 中介者模式;
/**
 * 
 * Description:同事实现类
 * @author:高鹤
 * @date:2017年7月10日
 */
public class ColleagueA extends AbstractColleague {

	@Override
	public void setNumber(int number, AbstractMediator am) {
		// TODO Auto-generated method stub
		 this.number = number;  
	        am.AaffectB();  

	}

}
