package ģ�淽��ģʽ;

/**
 * 
 *  Description:����һ�������࣬����ģ�巽��������Ϊ final
 * 
 * @author:�ߺ�
 * @date:2017��7��10��
 */
public abstract class Game {
	ThreadLocal<Long> t=new ThreadLocal<Long>();
	
	 void initialize(){
		 System.out.println("��Ϸ��ʼ:-------------------------");
		 t.set(System.currentTimeMillis());
	 }

	abstract void startPlay();

	abstract void endPlay();
    
	// ģ��
	public final void play() {
             
		// ��ʼ����Ϸ
		initialize();

		// ��ʼ��Ϸ
		startPlay();

		// ������Ϸ
		endPlay();
		 System.out.println("��Ϸ��ʱ:-------------------------"+(System.currentTimeMillis()-t.get()));
		 
	}
}
