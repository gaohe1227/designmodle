package 模版方法模式;

/**
 * 
 *  Description:创建一个抽象类，它的模板方法被设置为 final
 * 
 * @author:高鹤
 * @date:2017年7月10日
 */
public abstract class Game {
	ThreadLocal<Long> t=new ThreadLocal<Long>();
	
	 void initialize(){
		 System.out.println("游戏开始:-------------------------");
		 t.set(System.currentTimeMillis());
	 }

	abstract void startPlay();

	abstract void endPlay();
    
	// 模板
	public final void play() {
             
		// 初始化游戏
		initialize();

		// 开始游戏
		startPlay();

		// 结束游戏
		endPlay();
		 System.out.println("游戏耗时:-------------------------"+(System.currentTimeMillis()-t.get()));
		 
	}
}
