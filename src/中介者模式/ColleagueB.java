package �н���ģʽ;
/**
 * 
 * Description:ͬ����ʵ����
 * @author:�ߺ�
 * @date:2017��7��10��
 */
public class ColleagueB extends AbstractColleague {

	@Override
	public void setNumber(int number, AbstractMediator am) {
		this.number = number;
		am.BaffectA();
	}
}
