package ����¼ģʽ;

import java.util.Map;

/**
 * 
 * Description:����¼
 * 
 * @author:�ߺ�
 * @date:2017��7��12��
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
