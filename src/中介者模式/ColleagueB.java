package 中介者模式;
/**
 * 
 * Description:同事类实现类
 * @author:高鹤
 * @date:2017年7月10日
 */
public class ColleagueB extends AbstractColleague {

	@Override
	public void setNumber(int number, AbstractMediator am) {
		this.number = number;
		am.BaffectA();
	}
}
