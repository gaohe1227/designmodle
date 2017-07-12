package 命令模式;
/**
 * 
 * Description:命令接收者类:知道如何实施与执行一个请求的相关操作,并具体实施请求操作
 * @author:高鹤
 * @date:2017年7月12日
 */
public class Receiver {
	 //接收者真正执行命令  
  public void doAction(){
	  System.out.println("接收者Receiver执行命令");
  }
}
