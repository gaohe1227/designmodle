package 策略模式;
/**
 * 
 * Title:TrainStrategy
 * Description:具体策略1
 * Company:chaoxing
 * @author:高鹤
 * @date:2017年7月7日
 */
public class TrainStrategy implements TravelStrategy {

	@Override
	public void travelAlgorithm() {
		// TODO Auto-generated method stub
		System.out.println("策略1:乘坐火车");
		
	}

}
