package ����ģʽ.�򵥹���ģʽ;

import java.util.Scanner;

public class OperationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Operation op = null;  
	        Scanner scanner = new Scanner(System.in);  
	        try {  
	            do {  
	                System.out.println("��������A��");  
	                double numA = scanner.nextDouble();  
	                System.out.println("���������(+��-��*��/)��");  
	                String operate = scanner.next();  
	                System.out.println("��������B��");  
	                double numB = scanner.nextDouble();  
	  
	                op = OperationFactory.createOperation(operate);  
	                op.setNumA(numA);  
	                op.setNumB(numB);  
	                  
	                double result = op.getResult();  
	                System.out.println("������Ϊ��" + result);  
	                System.out.println("�Ƿ��������(Y/N)��");  
	            } while(!scanner.next().equalsIgnoreCase("n"));  
	        } catch (RuntimeException e) {  
	            System.err.println("�������쳣�˳���");  
	            e.printStackTrace();  
	        }  
	}

}
