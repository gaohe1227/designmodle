package ����.��jdk��̬����;

import java.io.File;
import java.io.IOException;

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
public class Myproxy {

	public static Object newProxyIntstance() throws IOException {
		String rt = "\r\n";// ���з�

		String str = "package ���ģʽ.��̬����;" + rt
				+"public class $Proxy0 implements Moveable {"+rt

				+ "public Proxy0(Moveable m) {" +rt
				+ "super();" + "this.m = m;" + rt
				+"}"+rt

				+ "private Moveable m;"+rt

				+ "@Override" +rt
				+"public void move() {"+rt
				+ "long starttime = System.currentTimeMillis();"+rt
				+ "System.out.println(\"������ʼ��ʻ....\");" +rt
				+ "m.move();" + rt
				+"long endtime = System.currentTimeMillis();"+rt
				+ "System.out.println(\"����������ʻ....  ������ʻʱ�䣺\" + (endtime - starttime) + \"���룡\");" +rt
				+ "}"+rt
				+ "}";
		String fileName=System.getProperty("user.dir")+"/bin/���ģʽ/��̬����/$Proxy0.java";//System.getProperty("user.dir")Ϊ��ǰ��Ŀ����·��
		File sourceFile=new File(fileName);
		FileUtils.writeStringToFile(sourceFile, str);//���ַ���д��ָ���ļ�
	 
		return str;

	}

}
