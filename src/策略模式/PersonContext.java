package 策略模式;

/**
 * 
 * Title:PersonContext Description:环境类,使用策略模式需要的上下文环境 
 * Company:chaoxing
 * 
 * @author:高鹤
 * @date:2017年7月7日
 */
public class PersonContext {
	private TravelStrategy strategy;

	public PersonContext(TravelStrategy strategy) {
		this.strategy = strategy;
	}

	public void executeStrategy() {
		strategy.travelAlgorithm();
	}
}
