package ����¼ģʽ;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Description:����¼������
 * @author:�ߺ�
 * @date:2017��7��12��
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
