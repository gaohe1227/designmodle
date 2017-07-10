package 设计模式.动态代理;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TimerImvocationHandle implements MyImvocationHandle {
    private Object target;
	public TimerImvocationHandle(Object target) {
		super();
		this.target = target;
	}
	@Override
	public void invoke(Object obj, Method method) {
		// TODO Auto-generated method stub
		try {
			long starttime = System.currentTimeMillis();
			System.out.println("汽车开始行驶....");
			method.invoke(target);
			long endtime = System.currentTimeMillis();
			System.out.println("汽车结束行驶....  汽车行驶时间：" + (endtime - starttime) + "毫秒！");
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
