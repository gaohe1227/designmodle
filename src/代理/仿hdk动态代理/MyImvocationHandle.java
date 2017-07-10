package 设计模式.动态代理;

import java.lang.reflect.Method;

public interface MyImvocationHandle {
public void invoke(Object obj,Method method);
}
