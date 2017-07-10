package ���ģʽ.��̬����;

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
			System.out.println("������ʼ��ʻ....");
			method.invoke(target);
			long endtime = System.currentTimeMillis();
			System.out.println("����������ʻ....  ������ʻʱ�䣺" + (endtime - starttime) + "���룡");
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
