package 备忘录模式;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Description:备忘录管理者
 * @author:高鹤
 * @date:2017年7月12日
 */
public class Caretaker1 {
	private Map<String,Memento1> map=new HashMap<String,Memento1>();
	public Memento1 getMemento1(String index){
		return map.get(index);
	}
	public void setMemento1(String index,Memento1 memento1){
		  this.map.put(index,memento1);
	}
}
