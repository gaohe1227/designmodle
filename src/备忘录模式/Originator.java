package ����¼ģʽ;
/**
 * 
 * Description:������:���𴴽�һ������¼,���Լ�¼��ǰʱ��������ڲ�״̬,����ʹ�ñ���¼�ָ������״̬.
 *              Originator���Ծ���Memento�д洢�������Щ״̬.
 * @author:�ߺ�
 * @date:2017��7��12��
 */
public class Originator {
	 private String state = "";

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	} 
	/**
	 * ��������¼
	 * @Title: createMenmto
	 * @Description: TODO
	 * @param @return
	 * @return Memento
	 * @throws
	 */
	public Memento createMenmto(){
		Memento memento=new Memento(this.state);
		return memento;
	}
	/**
	 * �ӱ���¼�лָ�����
	 * @Title: restoreMemento
	 * @Description: TODO
	 * @param @param memento
	 * @return void
	 * @throws
	 */
	public void restoreMemento(Memento memento){
		this.setState(memento.getState());
		
	}
}
