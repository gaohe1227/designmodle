package 设计模式.动态代理;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

import org.apache.commons.io.FileUtils;

/**
 * 
 * @author 高鹤
 * 
 * @2017年7月9日
 *
 * 			作用:自定义Proxy
 *
 */
public class Myproxy1 {

	public static Object newProxyIntstance(Class interfaceName) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		String rt = "\r\n";// 换行符
		String methodStr="";
		for (Method method : interfaceName.getMethods()) {
			methodStr	+="@Override" +rt
			+"public void "+method.getName()+"() {"+rt
			+ "long starttime = System.currentTimeMillis();"+rt
			+ "System.out.println(\"汽车开始行驶....\");" +rt
			+ "m."+method.getName()+"();" + rt
			+"long endtime = System.currentTimeMillis();"+rt
			+ "System.out.println(\"汽车结束行驶....  汽车行驶时间：\" + (endtime - starttime) + \"毫秒！\");" +rt
			+ "}"+rt;
		}
		

		String str = "package 设计模式.动态代理;" + rt
				+"public class $Proxy0 implements "+interfaceName.getName()+" {"+rt
				+ "private "+interfaceName.getName()+" m;"+rt
				+ "public $Proxy0("+interfaceName.getName()+" m) {" +rt
				+ "super();" + "this.m = m;" + rt
				+"}"+rt 
				+methodStr 
				
				+ "}";
		String fileName=System.getProperty("user.dir")+"/bin/设计模式/动态代理/$Proxy0.java";//System.getProperty("user.dir")为当前项目所在路径
		File sourceFile=new File(fileName);
		FileUtils.writeStringToFile(sourceFile, str);//将字符串写入指定文件
		JavaCompiler javaCompiler=ToolProvider.getSystemJavaCompiler();//获取当前系统的编译器
		StandardJavaFileManager fileMgr=javaCompiler.getStandardFileManager(null, null, null);//获取文件管理器
		Iterable units=fileMgr.getJavaFileObjects(fileName);//获取文件
		CompilationTask task=	javaCompiler.getTask(null, fileMgr, null, null, null, units);//获取编译任务
		task.call();//编译文件
		fileMgr.close();//关闭文件管理器
		ClassLoader classLoader=ClassLoader.getSystemClassLoader();//获取类加载器
		Class c=classLoader.loadClass("设计模式.动态代理.$Proxy0");//将设计模式.动态代理.$Proxy0加载到内存当中
		System.out.println(c.getName());
		Constructor constructor=c.getConstructor(interfaceName);//获取构造器
		return constructor.newInstance(new Car());

	}

}
