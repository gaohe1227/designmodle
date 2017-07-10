package 工厂模式.简单工厂模式;

import java.util.Scanner;

public class OperationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Operation op = null;  
	        Scanner scanner = new Scanner(System.in);  
	        try {  
	            do {  
	                System.out.println("输入数字A：");  
	                double numA = scanner.nextDouble();  
	                System.out.println("输入运算符(+、-、*、/)：");  
	                String operate = scanner.next();  
	                System.out.println("输入数字B：");  
	                double numB = scanner.nextDouble();  
	  
	                op = OperationFactory.createOperation(operate);  
	                op.setNumA(numA);  
	                op.setNumB(numB);  
	                  
	                double result = op.getResult();  
	                System.out.println("运算结果为：" + result);  
	                System.out.println("是否继续操作(Y/N)：");  
	            } while(!scanner.next().equalsIgnoreCase("n"));  
	        } catch (RuntimeException e) {  
	            System.err.println("程序发生异常退出！");  
	            e.printStackTrace();  
	        }  
	}

}
