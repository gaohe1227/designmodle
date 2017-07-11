package 代理.仿jdk动态代理;

import java.io.File;
import java.io.IOException;

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
public class Myproxy {

	public static Object newProxyIntstance() throws IOException {
		String rt = "\r\n";// 换行符

		String str = "package 设计模式.动态代理;" + rt
				+"public class $Proxy0 implements Moveable {"+rt

				+ "public Proxy0(Moveable m) {" +rt
				+ "super();" + "this.m = m;" + rt
				+"}"+rt

				+ "private Moveable m;"+rt

				+ "@Override" +rt
				+"public void move() {"+rt
				+ "long starttime = System.currentTimeMillis();"+rt
				+ "System.out.println(\"汽车开始行驶....\");" +rt
				+ "m.move();" + rt
				+"long endtime = System.currentTimeMillis();"+rt
				+ "System.out.println(\"汽车结束行驶....  汽车行驶时间：\" + (endtime - starttime) + \"毫秒！\");" +rt
				+ "}"+rt
				+ "}";
		String fileName=System.getProperty("user.dir")+"/bin/设计模式/动态代理/$Proxy0.java";//System.getProperty("user.dir")为当前项目所在路径
		File sourceFile=new File(fileName);
		FileUtils.writeStringToFile(sourceFile, str);//将字符串写入指定文件
	 
		return str;

	}

}
