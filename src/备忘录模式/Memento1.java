package 备忘录模式;

import java.util.Map;

/**
 * 
 * Description:备忘录
 * 
 * @author:高鹤
 * @date:2017年7月12日
 */
public class Memento1 {
	private Map<String, Object> stateMap;

	public Memento1(Map<String, Object> map){  
        this.stateMap = map;  
    }

	public Map<String, Object> getStateMap() {
		return stateMap;
	}

	public void setStateMap(Map<String, Object> stateMap) {
		this.stateMap = stateMap;
	}
}
