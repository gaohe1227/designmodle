package ���ģʽ.��̬����;

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
 * @author �ߺ�
 * 
 * @2017��7��9��
 *
 * 			����:�Զ���Proxy
 *
 */
public class Myproxy1 {

	public static Object newProxyIntstance(Class interfaceName) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		String rt = "\r\n";// ���з�
		String methodStr="";
		for (Method method : interfaceName.getMethods()) {
			methodStr	+="@Override" +rt
			+"public void "+method.getName()+"() {"+rt
			+ "long starttime = System.currentTimeMillis();"+rt
			+ "System.out.println(\"������ʼ��ʻ....\");" +rt
			+ "m."+method.getName()+"();" + rt
			+"long endtime = System.currentTimeMillis();"+rt
			+ "System.out.println(\"����������ʻ....  ������ʻʱ�䣺\" + (endtime - starttime) + \"���룡\");" +rt
			+ "}"+rt;
		}
		

		String str = "package ���ģʽ.��̬����;" + rt
				+"public class $Proxy0 implements "+interfaceName.getName()+" {"+rt
				+ "private "+interfaceName.getName()+" m;"+rt
				+ "public $Proxy0("+interfaceName.getName()+" m) {" +rt
				+ "super();" + "this.m = m;" + rt
				+"}"+rt 
				+methodStr 
				
				+ "}";
		String fileName=System.getProperty("user.dir")+"/bin/���ģʽ/��̬����/$Proxy0.java";//System.getProperty("user.dir")Ϊ��ǰ��Ŀ����·��
		File sourceFile=new File(fileName);
		FileUtils.writeStringToFile(sourceFile, str);//���ַ���д��ָ���ļ�
		JavaCompiler javaCompiler=ToolProvider.getSystemJavaCompiler();//��ȡ��ǰϵͳ�ı�����
		StandardJavaFileManager fileMgr=javaCompiler.getStandardFileManager(null, null, null);//��ȡ�ļ�������
		Iterable units=fileMgr.getJavaFileObjects(fileName);//��ȡ�ļ�
		CompilationTask task=	javaCompiler.getTask(null, fileMgr, null, null, null, units);//��ȡ��������
		task.call();//�����ļ�
		fileMgr.close();//�ر��ļ�������
		ClassLoader classLoader=ClassLoader.getSystemClassLoader();//��ȡ�������
		Class c=classLoader.loadClass("���ģʽ.��̬����.$Proxy0");//�����ģʽ.��̬����.$Proxy0���ص��ڴ浱��
		System.out.println(c.getName());
		Constructor constructor=c.getConstructor(interfaceName);//��ȡ������
		return constructor.newInstance(new Car());

	}

}
