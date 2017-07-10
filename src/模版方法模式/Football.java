package 模版方法模式;

import java.util.Random;

public class Football extends Game {

	 @Override
	   void endPlay() {
	      System.out.println("Football Game Finished!");
	   }

	 

	   @Override
	   void startPlay() {
	      System.out.println("Football Game Started. Enjoy the game!");
	      try {
			Thread.sleep(new Random().nextInt(1000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }

}
